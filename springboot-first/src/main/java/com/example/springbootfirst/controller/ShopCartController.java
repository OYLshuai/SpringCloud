package com.example.springbootfirst.controller;

import com.example.springbootfirst.ImpService.ShopcartService;
import com.example.springbootfirst.model.Shopcart;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/shopCart")
public class ShopCartController {

    @Resource
    ShopcartService shopcartService;

    @RequestMapping(value = "/addShopcartByOne", method = RequestMethod.POST)
    public int addShopcart(@RequestBody Shopcart shopcart) {
        Shopcart result = shopcartService.queryBookNum(shopcart.getBookNum());
        if(result != null){
            if (result.getShopAmount() == 99){
                return -1;
            } else {
                shopcart.setShopId(result.getShopId());
                return shopcartService.updateShopcartByOne(shopcart);
            }
        } else {
            return shopcartService.insertSelective(shopcart);
        }
//        return shopcartService.insert(shopcart);
    }
}

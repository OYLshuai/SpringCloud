package com.example.springbootfirst.ImpService.imp;

import com.example.springbootfirst.ImpService.ShopcartService;
import com.example.springbootfirst.mapper.ShopcartMapper;
import com.example.springbootfirst.model.Shopcart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShopcartServiceImp implements ShopcartService {

    @Autowired
    ShopcartMapper shopcartMapper;

    @Override
    public int insert(Shopcart shopcart) {
        return shopcartMapper.insert(shopcart);
    }

    @Override
    public Shopcart queryBookNum(int bookNum) {
        return shopcartMapper.queryBookNum(bookNum);
    }

    @Override
    public int updateShopcart(Shopcart shopcart) {
        return shopcartMapper.updateShopcart(shopcart);
    }

    @Override
    public int delShopcart(Shopcart shopcart) {
        return shopcartMapper.delShopcart(shopcart);
    }

    @Override
    public int updateShopcartByOne(Shopcart shopcart) {
        return shopcartMapper.updateShopcartByOne(shopcart);
    }

    @Override
    public int insertSelective(Shopcart record) {
        return shopcartMapper.insertSelective(record);
    }
}

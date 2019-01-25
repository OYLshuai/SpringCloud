package com.example.springbootfirst.ImpService;

import com.example.springbootfirst.model.Shopcart;

public interface ShopcartService {

    int insert(Shopcart shopcart);


    Shopcart queryBookNum(int bookNum);

    int updateShopcart(Shopcart shopcart);

    int delShopcart(Shopcart shopcart);

    int updateShopcartByOne(Shopcart shopcart);

    int insertSelective(Shopcart record);
}

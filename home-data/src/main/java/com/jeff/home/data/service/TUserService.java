package com.jeff.home.data.service;

import com.jeff.home.data.model.TUser;

/**
 * Created by JeffPeng on 2017/3/29.
 */
public interface TUserService {
    public TUser selectByPrimaryKey(int id);

    public int insertSelective(TUser tUser);
}

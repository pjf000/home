package com.jeff.home.data.service;

import com.jeff.home.data.model.TUser;

/**
 * Created by Administrator on 2017/3/20.
 */
public interface TUserService {

    public int deleteByPrimaryKey(Integer id);

    public int insert(TUser record);

    public int insertSelective(TUser record);

    public TUser selectByPrimaryKey(Integer id);

    public int updateByPrimaryKeySelective(TUser record);

    public int updateByPrimaryKey(TUser record);
}

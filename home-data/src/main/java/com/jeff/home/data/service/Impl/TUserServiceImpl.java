package com.jeff.home.data.service.Impl;

import com.jeff.home.data.dao.TUserDao;
import com.jeff.home.data.model.TUser;
import com.jeff.home.data.service.TUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by JeffPeng on 2017/3/29.
 */

@Service("tUserService")
public class TUserServiceImpl implements TUserService {

    @Autowired
    private TUserDao tUserDao;
    public TUser selectByPrimaryKey(int id) {
        return tUserDao.selectByPrimaryKey(id);
    }

    public int insertSelective(TUser tUser) {
        return tUserDao.insertSelective(tUser);
    }
}

package com.jeff.home.server.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jeff.home.api.model.TUserVo;
import com.jeff.home.api.service.IUserService;
import com.jeff.home.data.dao.TUserDao;
import com.jeff.home.data.model.TUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by JeffPeng on 2017/3/22.
 */
@Service(protocol = "dubbo")
@Slf4j
public class IUserServiceImpl implements IUserService {

    @Autowired
    private TUserDao tUserDao;

    public TUserVo login(TUserVo tUserVo) {
        TUser tUser = tUserDao.selectByPrimaryKey(tUserVo.getId());
        BeanUtils.copyProperties(tUser,tUserVo);
        return tUserVo;
    }
}

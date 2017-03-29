package com.jeff.home.server.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jeff.home.api.model.TUserVo;
import com.jeff.home.api.service.IUserService;
import com.jeff.home.data.model.TUser;
import com.jeff.home.data.service.TUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by JeffPeng on 2017/3/22.
 */
@Component
@Service(protocol = "dubbo")
@Slf4j
public class IUserServiceImpl implements IUserService {

    @Autowired
    private TUserService tUserService;

    public TUserVo login(TUserVo tUserVo) {
        TUser tUser = tUserService.selectByPrimaryKey(tUserVo.getId());
        BeanUtils.copyProperties(tUser,tUserVo);
        return tUserVo;
    }
}

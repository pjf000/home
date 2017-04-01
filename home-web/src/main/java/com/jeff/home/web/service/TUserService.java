package com.jeff.home.web.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jeff.home.api.model.TUserVo;
import com.jeff.home.api.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * Created by JeffPeng on 2017/3/30.
 */
@Service
public class TUserService {

    @Reference
    private IUserService iUserService;

    public TUserVo login(TUserVo tUserVo){
        return iUserService.login(tUserVo);
    }
}

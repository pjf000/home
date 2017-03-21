package com.jeff.home.data.service.impl;

import com.jeff.home.data.dao.TUserMapper;
import com.jeff.home.data.model.TUser;
import com.jeff.home.data.service.TUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/3/20.
 */
@Component
@Service
public class TUserServiceImpl implements TUserService {

    @Autowired
    private TUserMapper tUserMapper;

    public int deleteByPrimaryKey(Integer id) {
        return tUserMapper.deleteByPrimaryKey(id);
    }

    public int insert(TUser record) {
        return tUserMapper.insert(record);
    }

    public int insertSelective(TUser record) {
        return tUserMapper.insertSelective(record);
    }

    public TUser selectByPrimaryKey(Integer id) {
        return tUserMapper.selectByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(TUser record) {
        return tUserMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(TUser record) {
        return tUserMapper.updateByPrimaryKey(record);
    }
}

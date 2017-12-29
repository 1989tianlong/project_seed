package com.arch.power.service.impl;

import com.arch.power.dao.UserMapper;
import com.arch.power.model.User;
import com.arch.power.service.UserService;
import com.arch.power.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2017/12/29.
 */
@Service
@Transactional
public class UserServiceImpl extends AbstractService<User> implements UserService {
    @Resource
    private UserMapper userMapper;

}

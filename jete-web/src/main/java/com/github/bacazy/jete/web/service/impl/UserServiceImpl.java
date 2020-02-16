package com.github.bacazy.jete.web.service.impl;

import com.github.bacazy.jete.web.entity.UserEntity;
import com.github.bacazy.jete.web.repository.UserRepository;
import com.github.bacazy.jete.web.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserRepository userRepository;

    @Override
    public List<UserEntity> selectAll() {
        return userRepository.findAll();
    }
}

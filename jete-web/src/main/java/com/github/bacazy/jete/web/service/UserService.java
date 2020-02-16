package com.github.bacazy.jete.web.service;

import com.github.bacazy.jete.web.entity.UserEntity;

import java.util.List;

public interface UserService {
    List<UserEntity> selectAll();
}

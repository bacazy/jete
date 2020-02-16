package com.github.bacazy.jete.web.repository;

import com.github.bacazy.jete.web.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, String> {
}

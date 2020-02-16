package com.github.bacazy.jete.web.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "jete_user")
@Data
public class UserEntity {
    @Id
    String userUuid;

    String appUuid;

    String userLoginName;

    String userName;
}

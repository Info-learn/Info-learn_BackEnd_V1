package com.example.infolearn.domain

import com.example.infolearn.user.Role
import org.hibernate.annotations.OnDelete
import org.hibernate.annotations.OnDeleteAction
import javax.persistence.DiscriminatorValue
import javax.persistence.Entity


@Entity
@DiscriminatorValue("teacher")
@OnDelete(action = OnDeleteAction.CASCADE)
class Teacher(
    name: String,
    accountId: String,
    password: String
): User(
    name,
    accountId,
    password,
    Role.TEACHER
)
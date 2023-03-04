package com.example.infolearn.domain

import com.example.infolearn.user.Role
import org.hibernate.annotations.OnDelete
import org.hibernate.annotations.OnDeleteAction
import javax.persistence.Column
import javax.persistence.DiscriminatorValue
import javax.persistence.Entity
import javax.validation.constraints.Max
import javax.validation.constraints.Min


@Entity
@DiscriminatorValue("student")
@OnDelete(action = OnDeleteAction.CASCADE)
class Student(
    id: Long?,
    name: String,
    accountId: String,
    password: String,
    studentId: Int
): User(
    id,
    name,
    accountId,
    password,
    Role.STUDENT
){

    @Min(1101) @Max(2499)
    @Column(name = "student_id", nullable = false)
    val studentId: Int = studentId
}
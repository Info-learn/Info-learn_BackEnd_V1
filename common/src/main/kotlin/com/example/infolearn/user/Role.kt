package com.example.infolearn.user

enum class Role (
    val level: Int,
    val mean: String
) {
    BLOCK(0, "BLOCK"),
    STUDENT(1, "STUDENT"),
    TEACHER(2, "TEACHER"),
    ADMIN(3, "ADMIN")
    ;
}
package com.example.infolearn.application.port.out

import com.example.infolearn.domain.User

interface LoadUserByNamePort {

    fun findByName(name: String): User?
}
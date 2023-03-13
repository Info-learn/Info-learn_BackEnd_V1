package com.example.infolearn.adapter.out.persistence.repository

import com.example.infolearn.domain.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository: JpaRepository<User, Long> {

    fun findByAccountId(accountId: String): User?

    fun findByName(name: String): User?
}
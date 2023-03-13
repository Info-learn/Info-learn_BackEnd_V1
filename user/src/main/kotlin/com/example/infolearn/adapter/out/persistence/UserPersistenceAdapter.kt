package com.example.infolearn.adapter.out.persistence

import com.example.infolearn.adapter.out.persistence.repository.UserRepository
import com.example.infolearn.application.port.out.LoadUserByAccountIdPort
import com.example.infolearn.application.port.out.LoadUserByNamePort
import org.springframework.stereotype.Service

@Service
class UserPersistenceAdapter(
    private val userRepository: UserRepository
): LoadUserByNamePort, LoadUserByAccountIdPort {

    override fun findByName(name: String) = userRepository.findByName(name)

    override fun findByAccountId(accountId: String) = userRepository.findByAccountId(accountId)

}
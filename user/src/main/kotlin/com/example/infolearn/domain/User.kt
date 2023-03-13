package com.example.infolearn.domain

import com.example.infolearn.adapter.`in`.web.dto.response.UserDetailsResponse
import com.example.infolearn.user.Role
import org.hibernate.annotations.SQLDelete
import org.hibernate.annotations.Where
import javax.persistence.*
import javax.validation.constraints.Size

@Where(clause = "is_expelled = false")
@SQLDelete(sql = "UPDATE `user` SET is_expelled = true where id = ?")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "user_type")
@Entity(name = "user")
abstract class User(
    id: Long?,
    name: String,
    accountId: String,
    password: String,
    role: Role
) {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = id
        protected set

    @Size(min = 2, max = 4)
    @Column(name = "name", nullable = false,)
    var name: String = name
        protected set

    @Column(name = "account_id", nullable = false, unique = true)
    val accountId: String = accountId

    @Column(name = "password", nullable = false)
    var password: String = password
        protected set

    @ElementCollection(fetch = FetchType.EAGER)
    var roleList: MutableList<Role> = ArrayList()
        protected set

    @Column(name = "is_expelled", nullable = false)
    var isExpelled: Boolean = false
        protected set

    init {
        this.roleList.add(role)
    }

    fun toUserDetailsResponse() = UserDetailsResponse(
        this.id!!,
        this.name,
        this.accountId
    )
}
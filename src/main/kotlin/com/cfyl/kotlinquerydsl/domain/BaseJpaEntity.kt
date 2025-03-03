package com.cfyl.kotlinquerydsl.domain

import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.MappedSuperclass
import jakarta.persistence.PrePersist
import jakarta.persistence.PreUpdate
import jakarta.persistence.Version
import org.springframework.data.domain.AbstractAggregateRoot
import java.time.Instant

/**
 * @author : Mr.LiangQiangqiang
 * @code @created : 2025/3/1 周六
 */
@MappedSuperclass
abstract class BaseJpaEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = null,

    var createdAt: Instant? = null,
    var updatedAt: Instant? = null,

    @Version
    var version: Int = 0
)

    : AbstractAggregateRoot<BaseJpaEntity>()

{
    @PrePersist
    fun prePersist() {
        val currentTime = Instant.now()
        createdAt = currentTime
        updatedAt = currentTime
    }

    @PreUpdate
    fun preUpdate() {
        updatedAt = Instant.now()
    }
}
package com.cfyl.kotlinquerydsl.domain

import jakarta.persistence.Entity
import jakarta.persistence.Table
import org.hibernate.proxy.HibernateProxy

/**
 * @author : Mr.LiangQiangqiang
 * @code @created : 2025/3/1 周六
 */
@Entity
@Table
data class Book(var name: String, var author: String, var price: Double) : BaseJpaEntity() {

    final override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null) return false
        val oEffectiveClass =
            if (other is HibernateProxy) other.hibernateLazyInitializer.persistentClass else other.javaClass
        val thisEffectiveClass =
            if (this is HibernateProxy) this.hibernateLazyInitializer.persistentClass else this.javaClass
        if (thisEffectiveClass != oEffectiveClass) return false
        other as Book

        return id != null && id == other.id
    }

    final override fun hashCode(): Int =
        if (this is HibernateProxy) this.hibernateLazyInitializer.persistentClass.hashCode() else javaClass.hashCode()

    @Override
    override fun toString(): String {
        return this::class.simpleName + "(  id = $id )"
    }
}

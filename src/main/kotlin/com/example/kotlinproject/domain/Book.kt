package com.example.kotlinproject.domain

import jakarta.persistence.Entity
import jakarta.persistence.Table

/**
 * @author : Mr.LiangQiangqiang
 * @code @created : 2025/3/1 周六
 */
@Entity
@Table
data class Book(var name: String, var author: String, var price: Double) : BaseJpaEntity() {

    @Override
    override fun toString(): String {
        return this::class.simpleName + "(  id = $id   ,   name = $name   ,   author = $author   ,   price = $price   ,   createdAt = $createdAt   ,   updatedAt = $updatedAt   ,   version = $version )"
    }
}

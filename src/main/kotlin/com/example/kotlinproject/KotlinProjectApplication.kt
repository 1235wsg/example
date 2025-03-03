package com.example.kotlinproject

import com.querydsl.jpa.impl.JPAQueryFactory
import jakarta.persistence.EntityManager
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class KotlinProjectApplication{

    @Bean
    fun jpaQueryFactory(entityManager: EntityManager): JPAQueryFactory {
          return JPAQueryFactory(entityManager)
    }
}



fun main(args: Array<String>) {
    runApplication<KotlinProjectApplication>(*args)
}

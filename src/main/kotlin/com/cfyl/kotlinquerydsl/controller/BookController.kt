package com.cfyl.kotlinquerydsl.controller

import com.cfyl.kotlinquerydsl.domain.Book
import com.cfyl.kotlinquerydsl.domain.BookRepository
import com.querydsl.core.BooleanBuilder
import com.querydsl.jpa.impl.JPAQueryFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author : Mr.LiangQiangqiang
 * @code @created : 2025/3/1 周六
 */
@RestController
@RequestMapping("/book")
class BookController(val bookRepository: BookRepository, val jpaQueryFactory: JPAQueryFactory) {
    @GetMapping
    fun book() {

        val booleanBuilder = BooleanBuilder()
    }

    @PostMapping
    fun book(book: Book) {
        bookRepository.save(Book(name = "书名", author = "作者", price = 10.0))
    }
}

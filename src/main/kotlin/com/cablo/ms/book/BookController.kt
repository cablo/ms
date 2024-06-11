package com.cablo.book

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller
class BookController(private val bookRepository: BookRepository) {

    @Get("/books")
    fun index(): Any {
//        for (i in 1..10) {
//            bookRepository.save(Book(null, 1, "Name $i", "Author $i"))
//        }
        return bookRepository.findAll()
    }
}
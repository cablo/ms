package com.cablo.book

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller
class BookController(private val bookRepository: BookRepository) {

    @Get("/books")
    fun index(): Any {
        return bookRepository.findAll()
    }
}
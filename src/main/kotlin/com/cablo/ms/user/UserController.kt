package com.cablo.ms.user

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller
class UserController(private val userRepository: UserRepository) {

    @Get("/users")
    fun index(): Any {
        return userRepository.findAll()
    }
}
package com.cablo.ms.controller

import com.cablo.ms.db.User
import com.cablo.ms.db.UserRepository
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller
class UserController(private val userRepository: UserRepository) {

    @Get("/users")
    fun users(): List<User> = userRepository.findAll()
}
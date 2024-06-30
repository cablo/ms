package com.cablo.ms.controller

import io.micronaut.context.annotation.Value
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller
class EnvController(@Value("\${env_cablo}") private val env: String) {

    @Get("/env")
    fun env(): String = "env_cablo: $env"
}
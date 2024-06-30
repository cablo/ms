package com.cablo.ms.controller

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import java.net.URI

@Controller
class RootToPublicRedirect() {

    @Get("/")
    fun redirect(): HttpResponse<URI> {
        return HttpResponse.redirect(URI.create("/public"))
    }
}
package com.cablo.ms.controller

import com.cablo.ms.db.Team
import com.cablo.ms.db.TeamRepository
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller
class TeamController(private val teamRepository: TeamRepository) {

    @Get("/teams")
    fun teams(): List<Team> {
        val findAll = teamRepository.findAll()
        return findAll
    }
}
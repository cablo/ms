package com.cablo.ms.controller

import com.cablo.ms.db.Player
import com.cablo.ms.db.PlayerRepository
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller
class PlayerController(private val playerRepository: PlayerRepository) {

    @Get("/players")
    fun players(): List<Player> = playerRepository.findAll()
}
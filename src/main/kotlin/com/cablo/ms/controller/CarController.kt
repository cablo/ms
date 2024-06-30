package com.cablo.ms.controller

import com.cablo.ms.db.Car
import com.cablo.ms.db.CarRepository
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller
class CarController(private val carRepository: CarRepository) {

    @Get("/cars")
    fun cars(): List<Car> = carRepository.findAll()
}
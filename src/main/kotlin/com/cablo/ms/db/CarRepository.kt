package com.cablo.ms.db

import io.micronaut.data.jdbc.annotation.JdbcRepository
import io.micronaut.data.model.query.builder.sql.Dialect
import io.micronaut.data.repository.CrudRepository

@JdbcRepository(dialect = Dialect.POSTGRES)
interface CarRepository : CrudRepository<Car, Long> {

//    @Query("SELECT * FROM car WHERE id >= 1")
//    fun findSpecial(): List<Car>
}

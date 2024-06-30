package com.cablo.ms.db

import io.micronaut.data.annotation.Join
import io.micronaut.data.jdbc.annotation.JdbcRepository
import io.micronaut.data.model.query.builder.sql.Dialect
import io.micronaut.data.repository.CrudRepository

@JdbcRepository(dialect = Dialect.POSTGRES)
@Join(value = "cars", type = Join.Type.FETCH)
interface UserRepository : CrudRepository<User, Long> {

//    @Query("SELECT u FROM user u LEFT JOIN FETCH u.cars WHERE u.id = :userId")
//    fun findByIdWithCars(userId: Long): User?
}

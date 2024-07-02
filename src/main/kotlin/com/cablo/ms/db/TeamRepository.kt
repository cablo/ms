package com.cablo.ms.db

import io.micronaut.data.annotation.Join
import io.micronaut.data.jdbc.annotation.JdbcRepository
import io.micronaut.data.model.query.builder.sql.Dialect
import io.micronaut.data.repository.CrudRepository

@JdbcRepository(dialect = Dialect.POSTGRES)
@Join(value = "players", type = Join.Type.OUTER_FETCH)
interface TeamRepository : CrudRepository<Team, Long>
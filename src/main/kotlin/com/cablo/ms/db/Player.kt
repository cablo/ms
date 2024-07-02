package com.cablo.ms.db

import io.micronaut.data.annotation.GeneratedValue
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity
import io.micronaut.serde.annotation.Serdeable

@Serdeable
@MappedEntity
data class Player(
    @field:Id
    @field:GeneratedValue(GeneratedValue.Type.AUTO)
    var id: Long,
    var teamId: Long,

    var name: String,
    var birthYear: Long,
)
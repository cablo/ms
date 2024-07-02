package com.cablo.ms.db

import io.micronaut.data.annotation.GeneratedValue
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity
import io.micronaut.data.annotation.Relation
import io.micronaut.serde.annotation.Serdeable

@Serdeable
@MappedEntity
data class Team(
    @field:Id
    @field:GeneratedValue(GeneratedValue.Type.AUTO)
    var id: Long,

    var name: String,
    var location: String,

    @field:Relation(value = Relation.Kind.ONE_TO_MANY, mappedBy = "teamId")
    var players: List<Player>? = null
)
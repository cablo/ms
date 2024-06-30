package com.cablo.ms.db

import io.micronaut.data.annotation.GeneratedValue
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity
import io.micronaut.data.annotation.Relation
import io.micronaut.serde.annotation.Serdeable

@Serdeable
@MappedEntity
data class Car(
    @field:Id
    @field:GeneratedValue(GeneratedValue.Type.AUTO)
    var id: Long,

    @field:Relation(value = Relation.Kind.MANY_TO_ONE)
    var user: User?,

    var make: String,
    var model: String,
    var year: Int
)
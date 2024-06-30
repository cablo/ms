package com.cablo.ms.db

import io.micronaut.data.annotation.GeneratedValue
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity
import io.micronaut.serde.annotation.Serdeable

@Serdeable
@MappedEntity
data class Car(
    @field:Id
    @field:GeneratedValue(GeneratedValue.Type.AUTO)
    var id: Long,
    var userId: Long,

    var make: String,
    var model: String,
    var year: Int
)
package com.cablo.ms.db

import io.micronaut.data.annotation.GeneratedValue
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity
import io.micronaut.serde.annotation.Serdeable

@Serdeable
@MappedEntity
data class User(
    @field:Id
    @field:GeneratedValue(GeneratedValue.Type.AUTO)
    var id: Long,

    var name: String,
    var address: String
)
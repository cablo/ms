package com.cablo.book

import io.micronaut.data.annotation.GeneratedValue
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity
import io.micronaut.serde.annotation.Serdeable

@Serdeable
@MappedEntity
data class Book(
    @field:Id @field:GeneratedValue(GeneratedValue.Type.AUTO) var id: Long?,
    var userId: Long,
    var name: String,
    var author: String
)
package com.example.domain.base

abstract class LongTypeIdentifier protected constructor(
    private val id: Long,
) : ValueObject<LongTypeIdentifier>(), Identifier {

    fun longValue(): Long? {
        return id
    }

    override fun toString(): String {
        return id.toString()
    }

    override fun getEqualityFields(): Array<Any> {
        return arrayOf<Any>(id)
    }
}

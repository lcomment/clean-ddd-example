package com.example.domain.base

abstract class IntegerTypeIdentifier protected constructor(
    private val id: Int,
) : ValueObject<IntegerTypeIdentifier>(), Identifier {

    fun intValue(): Int {
        return id
    }

    override fun toString(): String {
        return id.toString()
    }

    override fun getEqualityFields(): Array<Any> {
        return arrayOf<Any>(id)
    }
}

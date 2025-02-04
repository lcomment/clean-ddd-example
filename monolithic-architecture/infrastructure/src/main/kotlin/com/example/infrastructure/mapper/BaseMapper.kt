package com.example.infrastructure.mapper

import java.util.function.Supplier
import java.util.stream.Collectors
import java.util.stream.Stream
import com.example.domain.base.IntegerTypeIdentifier
import com.example.domain.base.LongTypeIdentifier

abstract class BaseMapper<AR, ARE> {

    abstract fun toDomain(entity: ARE): AR

    abstract fun toEntity(domain: AR): ARE

    protected fun getIdFrom(value: IntegerTypeIdentifier?): Int? {
        return value?.intValue()
    }

    protected fun getIdFrom(value: LongTypeIdentifier?): Long? {
        return value?.longValue()
    }

    protected fun <T> toMutableList(stream: Stream<T>?): MutableList<T> {
        return stream?.collect(Collectors.toCollection(Supplier { mutableListOf() })) ?: mutableListOf()
    }

    protected fun <T> toMutableSet(stream: Stream<T>?): MutableSet<T> {
        return stream?.collect(Collectors.toCollection(Supplier { mutableSetOf() })) ?: mutableSetOf()
    }
}

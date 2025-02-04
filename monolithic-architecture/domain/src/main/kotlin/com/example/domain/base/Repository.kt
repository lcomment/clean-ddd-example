package com.example.domain.base

interface Repository<AR : AggregateRoot<AR, ARID>, ARID> {

    fun save(aggregateRoot: AR): AR

    fun find(id: ARID): AR?

    fun delete(aggregateRoot: AR)
}

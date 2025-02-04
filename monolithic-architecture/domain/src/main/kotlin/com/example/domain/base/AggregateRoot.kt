package com.example.domain.base

import java.util.ArrayList

abstract class AggregateRoot<T : Domain<T, TID>, TID> : Domain<T, TID>() {
    private val domainEvents: MutableList<Any?> = ArrayList<Any?>()

    protected fun registerEvent(event: Any?) {
        domainEvents.add(event)
    }

    protected fun clearEvents() {
        domainEvents.clear()
    }

    fun getDomainEvents(): MutableList<Any?> {
        return domainEvents
    }
}

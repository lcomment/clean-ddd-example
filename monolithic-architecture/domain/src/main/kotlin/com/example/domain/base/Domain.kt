package com.example.domain.base

abstract class Domain<T : Domain<T, TID>, TID> {

    protected fun <L> initList(list: List<L>?): MutableList<L> {
        return list?.toMutableList() ?: mutableListOf()
    }

    protected fun <L> initSet(set: Set<L?>?): MutableSet<L?> {
        return set?.toMutableSet() ?: mutableSetOf()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || getId() == null || javaClass != other.javaClass) return false

        @Suppress("UNCHECKED_CAST")
        return getId() == (other as T).getId()
    }

    override fun hashCode(): Int {
        return getId()?.hashCode() ?: 0
    }

    protected abstract fun getId(): TID?
}

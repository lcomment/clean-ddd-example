package com.example.infrastructure.persistence.repository

import org.springframework.data.jpa.repository.JpaRepository
import com.example.domain.base.AggregateRoot
import com.example.domain.base.Repository
import com.example.infrastructure.mapper.BaseMapper
import com.linecorp.kotlinjdsl.support.spring.data.jpa.repository.KotlinJdslJpqlExecutor

abstract class BaseRepository<AR : AggregateRoot<AR, ARID>, ARID, ARE : Any, AREID>(
    protected val repository: JpaRepository<ARE, AREID>,
    protected val mapper: BaseMapper<AR, ARE>,
    protected val jdslExecutor: KotlinJdslJpqlExecutor,
) : Repository<AR, ARID> {

    override fun save(aggregateRoot: AR): AR {
        val entity = repository.save(mapper.toEntity(aggregateRoot))

        return mapper.toDomain(entity)
    }

    override fun delete(aggregateRoot: AR) {
        repository.delete(mapper.toEntity(aggregateRoot))
    }
}

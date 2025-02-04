package com.example.infrastructure.cache.annotation

import org.springframework.stereotype.Repository

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
@Repository
annotation class RedisRepository

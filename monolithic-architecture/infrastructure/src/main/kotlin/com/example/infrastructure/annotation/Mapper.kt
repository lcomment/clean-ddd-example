package com.example.infrastructure.annotation

import org.springframework.core.annotation.AliasFor
import org.springframework.stereotype.Component

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@Component
annotation class Mapper(

    /**
     * Alias for [Component.value].
     */
    @get:AliasFor(annotation = Component::class) val value: String = "",
)

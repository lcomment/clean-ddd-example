package com.example.infrastructure.persistence.annotation

import org.springframework.core.annotation.AliasFor
import org.springframework.stereotype.Component

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@Component
annotation class Reader(

    /**
     * Alias for [Component.value].
     */
    @get:AliasFor(annotation = Component::class) val value: String = "",
)

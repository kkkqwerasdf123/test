package com.neohoon.jdsl

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinJdslApplication

fun main(args: Array<String>) {
    runApplication<KotlinJdslApplication>(*args)
}

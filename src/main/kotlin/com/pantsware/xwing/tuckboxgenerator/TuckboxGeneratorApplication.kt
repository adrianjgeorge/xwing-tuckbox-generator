package com.pantsware.xwing.tuckboxgenerator

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TuckboxGeneratorApplication

fun main(args: Array<String>) {
    runApplication<TuckboxGeneratorApplication>(*args)
}

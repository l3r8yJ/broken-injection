package ru.l3r8y.brokeninjection

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BrokenInjectionApplication

fun main(args: Array<String>) {
    runApplication<BrokenInjectionApplication>(*args)
}

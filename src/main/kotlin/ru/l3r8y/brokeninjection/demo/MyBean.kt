package ru.l3r8y.brokeninjection.demo

import jakarta.annotation.PostConstruct
import org.springframework.stereotype.Component

@Component
class MyBean {

    @PostConstruct
    fun init() {
        println("I'm a Bean!")
    }
}
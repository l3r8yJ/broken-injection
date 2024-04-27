package ru.l3r8y.brokeninjection.demo

import org.springframework.beans.factory.annotation.Autowired

abstract class AbstractRepo {

    @Autowired
    lateinit var bean: MyBean
}
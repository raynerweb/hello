package br.com.fiap.hello.rest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class HelloRest {


    @GetMapping
    fun get(): String {
        return "hello-world"
    }
}
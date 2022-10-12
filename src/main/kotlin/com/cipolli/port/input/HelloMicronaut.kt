package com.cipolli.port.input

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces

@Controller("/hello")
class HelloMicronaut {


    @Get
    @Produces(MediaType.TEXT_PLAIN)
    public fun hello(): String {
        return "Hello Micronauter!!!";
    }
}
package com.cbarnick.pokedex.controller

import com.cbarnick.pokedex.model.Character
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Sample controller to test application
 */
@RestController
class HelloController {

    /**
     * Index page for testing application
     */
    @GetMapping
    fun index(): List<Character> = listOf(
        Character(0, "Rhaenyra"),
        Character(1, "Daemon"),
        Character(2, "Aegon")
    )
}

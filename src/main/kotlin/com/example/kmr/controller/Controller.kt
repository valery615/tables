package com.example.kmr.controller

import com.example.kmr.entity.Phone
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller {

    @GetMapping("/all")
    fun getAllPhones() : List<Phone> {
        return listOf(Phone("Samsung", 6.3, 300))
    }
}
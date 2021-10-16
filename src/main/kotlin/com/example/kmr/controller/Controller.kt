package com.example.kmr.controller

import com.example.kmr.dto.PhoneDto
import com.example.kmr.entity.Phone
import com.example.kmr.repository.PhoneRepository
import com.example.kmr.service.PhoneService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

@RestController
class Controller @Autowired constructor(val phoneService: PhoneService) {

    @GetMapping("/all")
    fun getAllPhones(): List<Phone> {
        return phoneService.findAll()
    }

    @GetMapping("/phone/{name}")
    fun findByName(@PathVariable name: String): Phone {
        return phoneService.findByName(name)
    }

    @PostMapping("/phone")
    fun addNewPhone(@RequestBody dto: PhoneDto): Phone {
        return phoneService.save(dto);
    }

    @GetMapping("/price")
    fun getSumOfPrices(): Int {
        return phoneService.getSumOfPrices()
    }

}
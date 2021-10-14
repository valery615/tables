package com.example.kmr.controller

import com.example.kmr.entity.Phone
import com.example.kmr.repository.PhoneRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller @Autowired constructor(val phoneRepository : PhoneRepository) {
//TODO replace with service
    @GetMapping("/all")
    fun getAllPhones() : List<Phone> {
        return phoneRepository.findAll()
    }
}
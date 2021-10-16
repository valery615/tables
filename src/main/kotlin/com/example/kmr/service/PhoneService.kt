package com.example.kmr.service

import com.example.kmr.dto.PhoneDto
import com.example.kmr.entity.Phone

interface PhoneService {
    fun findAll(): List<Phone>
    fun findByName(name: String): Phone
    fun save(dto: PhoneDto): Phone
    fun getSumOfPrices() : Int
}
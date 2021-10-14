package com.example.kmr.service

import com.example.kmr.entity.Phone

interface PhoneService {
    fun getAll(): List<Phone>
}
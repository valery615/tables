package com.example.kmr.repository

import com.example.kmr.entity.Phone
import org.springframework.data.mongodb.repository.MongoRepository

interface PhoneRepository : MongoRepository<Phone, String> {
    fun findByName(name : String) : Phone
}
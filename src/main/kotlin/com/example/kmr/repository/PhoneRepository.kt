package com.example.kmr.repository

import com.example.kmr.entity.Phone
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.mongodb.repository.MongoRepository

interface PhoneRepository : MongoRepository<Phone, Int> {
}
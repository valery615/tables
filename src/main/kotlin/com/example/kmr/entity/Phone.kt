package com.example.kmr.entity

import org.springframework.data.mongodb.core.mapping.Document

@Document("phones")
data class Phone (
    val name: String,
    val inches: Double,
    val price: Int)
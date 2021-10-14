package com.example.kmr.entity

import org.springframework.data.mongodb.core.mapping.Document
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Document("phones")
class Phone (
    @Id
    val id:Int,
    val name: String,
    val inches: Double,
    val price: Int)
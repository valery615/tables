package com.example.kmr.repository

import com.example.kmr.entity.Room
import org.springframework.data.jpa.repository.JpaRepository

interface RoomRepository : JpaRepository<Room, Int> {
    fun findByNumber(number: Int?) : Room
}
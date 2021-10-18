package com.example.kmr.service

import com.example.kmr.entity.Room

interface RoomService {
    fun findAll(): List<Room>
    fun save(room: Room): Room
}
package com.example.kmr.service

import com.example.kmr.entity.Room
import com.example.kmr.repository.RoomRepository
import org.springframework.stereotype.Service

@Service
class RoomServiceImpl constructor(
    private val roomRepository: RoomRepository,
) : RoomService {

    override fun findAll(): List<Room> {
        val rooms = roomRepository.findAll()
        return rooms
    }

    override fun save(room: Room): Room {
        if (roomRepository.existsByNumber(room.number))
            throw Exception("Already exists!")
        return roomRepository.save(room)
    }
}
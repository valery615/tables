package com.example.kmr.controller

import com.example.kmr.entity.Room
import com.example.kmr.service.RoomService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller @Autowired constructor(val roomService: RoomService) {

    @GetMapping("/all")
    fun getAllPhones(): List<Room> {
        return roomService.findAll()
    }

    @PostMapping("/room")
    fun saveRoom(@RequestBody room : Room) :Room {
        return roomService.save(room)
    }
}
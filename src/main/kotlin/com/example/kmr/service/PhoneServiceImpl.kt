package com.example.kmr.service

import com.example.kmr.dto.PhoneDto
import com.example.kmr.entity.Phone
import com.example.kmr.mapper.PhoneMapper
import com.example.kmr.repository.PhoneRepository
import org.springframework.stereotype.Service

@Service
class PhoneServiceImpl constructor(
    private val phoneRepository: PhoneRepository,
    val phoneMapper: PhoneMapper
) : PhoneService {

    override fun findAll(): List<Phone> {
        return phoneRepository.findAll()
    }

    override fun findByName(name: String): Phone {
        return phoneRepository.findByName(name)
    }

    override fun save(dto: PhoneDto): Phone {
        val phone = phoneMapper.toEntity(dto)
        return phoneRepository.save(phone)
    }

    override fun getSumOfPrices(): Int {
        return phoneRepository.findAll().sumOf { it.price }
    }
}
package com.example.kmr.mapper

import com.example.kmr.dto.PhoneDto
import com.example.kmr.entity.Phone
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface PhoneMapper {

    fun toEntity(dto: PhoneDto): Phone
}
package com.example.backend.mapper

import com.example.backend.dto.NamesDto
import com.example.backend.model.Names

class NomeMapper {
    fun toDto(name: Names): Names {
        return Names(
            id = name.id,
            name = name.name
        )
    }

    fun Names(dto: NamesDto): Names {
        return Names(
            id = dto.id,
            name = dto.name
        )
    }
}

package com.example.backend.mapper
import com.example.backend.dto.VagasDto
import com.example.backend.model.Vagas

class VagasMapper {


    fun toDto(vagas: Vagas): Vagas {
        return Vagas(
            id = vagas.id,
            namevaga = vagas.namevaga,
            statusvaga = vagas.statusvaga
        )
    }

    fun vagas(dto: Vagas): Vagas {
        return com.example.backend.model.Vagas(
            id = dto.id,
            namevaga = dto.namevaga,
            statusvaga = dto.statusvaga
        )
    }
}

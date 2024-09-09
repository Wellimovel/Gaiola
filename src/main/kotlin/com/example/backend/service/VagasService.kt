package com.example.backend.service
import com.example.backend.dto.AtualizarVagas
import com.example.backend.dto.VagasDto
import com.example.backend.repository.VagasRepository
import com.example.backend.mapper.VagasMapper
import com.example.backend.model.Vagas
import org.springframework.data.crossstore.ChangeSetPersister
import org.springframework.stereotype.Service


@Service
class VagasService (private val vagasRepository: VagasRepository){

    private val mapper = VagasMapper()

    fun getAllVagas(): List<Vagas> {
        val vagas = vagasRepository.findAll()
        return vagas.map { vagas:Vagas -> mapper.toDto(vagas)}
}




}





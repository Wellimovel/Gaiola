
package com.example.backend.service

import com.example.backend.repository.NomeRepository
import com.example.backend.mapper.NomeMapper
import com.example.backend.model.Names

import org.springframework.stereotype.Service

@Service // Marca a classe como um serviço, onde a lógica de negócio reside
class NomeService(private val nomeRepository: NomeRepository) {

    private val mapper = NomeMapper()

    fun getAllNames(): List<Names> {
        val names = nomeRepository.findAll()
        return names.map { name -> mapper.toDto(name)}

    }
}

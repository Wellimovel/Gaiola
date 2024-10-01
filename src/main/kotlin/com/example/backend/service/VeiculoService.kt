package com.example.backend.service

import com.example.backend.dto.VeiculoDTO
import com.example.backend.mapper.VeiculoMapper
import com.example.backend.model.Veiculo
import com.example.backend.repository.VeiculoRepository
import org.springframework.stereotype.Service

@Service
class VeiculoService(
    private val veiculoRepository: VeiculoRepository
) {
    private val mapper = VeiculoMapper()

    fun getAllVeiculos(): List<VeiculoDTO> {
        val veiculos = veiculoRepository.findAll()
        return veiculos.map { veiculo: Veiculo -> mapper.toDto(veiculo) }
    }

    fun buscarPorId(id: Long): Veiculo {
        return veiculoRepository.findAll().stream()
            .filter { t -> t.id == id }
            .findFirst()
            .orElseThrow { RuntimeException("Veículo não encontrado com id: $id") }
    }

    fun saveVeiculos(veiculoDTOs: List<VeiculoDTO>) {
        val veiculos = veiculoDTOs.map { mapper.toVeiculo(it) }
        veiculoRepository.saveAll(veiculos)
    }
}
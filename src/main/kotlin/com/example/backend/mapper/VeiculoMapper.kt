package com.example.backend.mapper

import com.example.backend.dto.VeiculoDTO
import com.example.backend.model.Veiculo
import org.springframework.stereotype.Component

@Component
class VeiculoMapper {
    fun toVeiculo(dto: VeiculoDTO): Veiculo {
        return Veiculo(
            motorista = dto.motorista,
            facility = dto.facility,
            servico = dto.servico,
            eta = dto.eta,
            tipoVeiculo = dto.tipoVeiculo
        )
    }

    fun toDto(veiculo: Veiculo): VeiculoDTO {
        return VeiculoDTO(
            motorista = veiculo.motorista,
            facility = veiculo.facility,
            servico = veiculo.servico,
            eta = veiculo.eta,
            tipoVeiculo = veiculo.tipoVeiculo
        )
    }
}
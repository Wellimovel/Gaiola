package com.example.backend.controller

import com.example.backend.dto.VeiculoDTO
import com.example.backend.model.Modal
import com.example.backend.model.Veiculo
import com.example.backend.service.ModalService
import com.example.backend.service.VeiculoService
import org.springframework.web.bind.annotation.*
@RestController
@RequestMapping("/veiculos")

@CrossOrigin(origins = ["http://localhost:8080/veiculos"])
class VeiculoController(private val VeiculoService: VeiculoService) {


        @GetMapping
        fun getAllVeiculos(): List<VeiculoDTO> {
            return VeiculoService.getAllVeiculos()

        @GetMapping("/{id}")
        fun buscarPorId(@PathVariable id:Long): Veiculo {
            return VeiculoService.buscarPorId(id)
        }
    }
    @PostMapping
    fun saveVeiculos(@RequestBody veiculoDTOs: List<VeiculoDTO>) {
        VeiculoService.saveVeiculos(veiculoDTOs)
    }
}
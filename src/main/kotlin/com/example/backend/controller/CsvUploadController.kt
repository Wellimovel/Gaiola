package com.example.backend.controller

import com.example.backend.dto.VeiculoDTO
import com.example.backend.service.VeiculoService
import org.springframework.web.bind.annotation.*
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.multipart.MultipartFile
import java.io.BufferedReader
import java.io.InputStreamReader

@RestController
@RequestMapping("/upload")
class CsvUploadController(
    private val veiculoService: VeiculoService // Verifique a injeção do serviço
) {
    @PostMapping
    fun uploadCsv(@RequestParam("file") file: MultipartFile): ResponseEntity<String> {
        return try {
            val reader = BufferedReader(InputStreamReader(file.inputStream))
            val veiculoDTOs = reader.lineSequence().drop(1).map { line ->
                val parts = line.split(",")
                VeiculoDTO(
                    motorista = parts[0],
                    facility = parts[1],
                    servico = parts[2],
                    eta = parts[3],
                    tipoVeiculo = parts[4]
                )
            }.toList()

            veiculoService.saveVeiculos(veiculoDTOs)

            ResponseEntity("CSV file uploaded and processed successfully", HttpStatus.OK)
        } catch (e: Exception) {
            ResponseEntity("Failed to upload CSV", HttpStatus.INTERNAL_SERVER_ERROR)
        }
    }
}

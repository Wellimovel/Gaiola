package com.example.backend.controller

import com.example.backend.dto.AtualizarVagas
import com.example.backend.model.Vagas
import com.example.backend.service.VagasService
import jakarta.transaction.Transactional
import jakarta.validation.Valid
import org.springframework.cache.annotation.CacheEvict
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/vagas")

@CrossOrigin(origins = ["http://localhost:8080/vagas"])
class VagasController (private val vagasService: VagasService){

    @GetMapping
    fun getAllVagas(): List<Vagas> {
        return vagasService.getAllVagas()
    }




}


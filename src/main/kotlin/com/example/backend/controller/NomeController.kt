package com.example.backend.controller

import com.example.backend.model.Names
import com.example.backend.service.NomeService

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/nomes")
@CrossOrigin(origins = ["http://localhost:8080/nomes"])
class NomeController(private val nomeService: NomeService) {

    @GetMapping
    fun getAllNames(): List<Names> {
        return nomeService.getAllNames()
    }


}



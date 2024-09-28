package com.example.backend.controller

import com.example.backend.model.Modal
import com.example.backend.service.ModalService
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/modal")

@CrossOrigin(origins = ["http://localhost:8080/modal"])
class ModalController (private val modalService: ModalService){

    @GetMapping
    fun getAllModal(): List<Modal> {
        return modalService.getAllModal()
    }

    @GetMapping("/{id}")
    fun buscarPorId(@PathVariable id:Long):Modal{
        return modalService.buscarPorId(id)
    }

}


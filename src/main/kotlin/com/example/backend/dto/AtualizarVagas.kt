package com.example.backend.dto

import jakarta.validation.constraints.NotNull

class AtualizarVagas (
    @field:NotNull
    val id: Long,
    val statusvaga: Long
)



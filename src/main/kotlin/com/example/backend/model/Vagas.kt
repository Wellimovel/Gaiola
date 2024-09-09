package com.example.backend.model
import jakarta.persistence.*

@Entity
data class Vagas (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val namevaga:Long,
    val statusvaga:Long,
)





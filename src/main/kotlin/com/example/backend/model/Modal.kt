package com.example.backend.model
import jakarta.persistence.*

@Entity
data class Modal (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val namemodal:String,

)





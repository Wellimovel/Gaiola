package com.example.backend.model
import jakarta.persistence.*


//simula
@Entity
data class Modal (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val namemodal:String,

)





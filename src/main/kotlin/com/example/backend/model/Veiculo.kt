package com.example.backend.model

import jakarta.persistence.*


@Entity
@Table(name = "veiculos")
data class Veiculo(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(name = "motorista")
    val motorista: String,

    @Column(name = "facility")
    val facility: String,

    @Column(name = "servico")
    val servico: String,

    @Column(name = "eta")
    val eta: String,

    @Column(name = "tipo_veiculo")
    val tipoVeiculo: String
)
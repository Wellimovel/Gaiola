package com.example.backend.model

import jakarta.persistence.*

@Entity
@Table(name = "names")  // Certifique-se que o nome da tabela é 'names'
data class Names(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @Column(name = "NAME")  // Este nome deve corresponder ao nome da coluna no banco de dados
    val name: String
)







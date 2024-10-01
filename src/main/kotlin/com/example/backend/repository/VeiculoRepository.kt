package com.example.backend.repository

import com.example.backend.model.Veiculo
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface VeiculoRepository : JpaRepository<Veiculo, Long>
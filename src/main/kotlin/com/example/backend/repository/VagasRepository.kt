package com.example.backend.repository
import com.example.backend.model.Vagas
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface VagasRepository : JpaRepository<Vagas, Long> {

}




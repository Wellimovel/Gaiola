package com.example.backend.repository

import com.example.backend.model.Names
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface NomeRepository : JpaRepository<Names, Long> {

}

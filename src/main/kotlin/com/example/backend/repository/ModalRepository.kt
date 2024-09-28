package com.example.backend.repository
import com.example.backend.model.Modal
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface ModalRepository : JpaRepository<Modal, Long> {

}




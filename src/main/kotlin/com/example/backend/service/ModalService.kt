package com.example.backend.service
import com.example.backend.mapper.ModalMapper
import com.example.backend.model.Modal
import com.example.backend.repository.ModalRepository
import org.springframework.stereotype.Service


@Service
class ModalService (private val modalRepository: ModalRepository){

    private val mapper = ModalMapper()

    fun getAllModal(): List<Modal> {
        val modal = modalRepository.findAll()
        return modal.map { modal:Modal -> mapper.toDto(modal)}
}

    fun buscarPorId(id:Long): Modal {
        val modalid = modalRepository.findAll()
        return modalid.stream().filter{ t ->
        t.id == id
    }.findFirst().get()
    }



}





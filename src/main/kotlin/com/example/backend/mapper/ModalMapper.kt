package com.example.backend.mapper
import com.example.backend.model.Modal

class ModalMapper {


    fun toDto(modal: Modal): Modal {
        return Modal(
            id = modal.id,
            namemodal = modal.namemodal,

        )
    }

    fun modal(dto: Modal): Modal {
        return com.example.backend.model.Modal(
            id = dto.id,
            namemodal = dto.namemodal,

        )
    }
}

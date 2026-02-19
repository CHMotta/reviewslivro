package com.reviewlivro.ReviewLivro.dtos;

import com.reviewlivro.ReviewLivro.enums.PerfilUsuarioEnum;

public record UsuarioRespostaDto(
        Long id,
        String nome,
        PerfilUsuarioEnum perfil,
        String bio
) {

}

package com.reviewlivro.ReviewLivro.servico;

import com.reviewlivro.ReviewLivro.dtos.UsuarioRequisicaoDto;
import com.reviewlivro.ReviewLivro.dtos.UsuarioRespostaDto;

public interface UsuarioServico {

    UsuarioRespostaDto criarUsuario (UsuarioRequisicaoDto dto);


}

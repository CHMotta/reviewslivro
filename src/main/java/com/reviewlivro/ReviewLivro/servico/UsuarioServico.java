package com.reviewlivro.ReviewLivro.servico;

import com.reviewlivro.ReviewLivro.dtos.UsuarioRequisicaoDto;
import com.reviewlivro.ReviewLivro.dtos.UsuarioRespostaDto;
import com.reviewlivro.ReviewLivro.entidades.UsuarioEntidade;

import java.util.List;

public interface UsuarioServico {

    List<UsuarioRespostaDto> buscarTodos();

    UsuarioRespostaDto criarUsuario (UsuarioRequisicaoDto dto);

    UsuarioRespostaDto atualizar (Long id, UsuarioRequisicaoDto dto);

    UsuarioEntidade buscarEntidadePorId(Long id);
}

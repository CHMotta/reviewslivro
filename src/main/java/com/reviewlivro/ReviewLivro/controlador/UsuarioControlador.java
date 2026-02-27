package com.reviewlivro.ReviewLivro.controlador;


import com.reviewlivro.ReviewLivro.dtos.UsuarioRequisicaoDto;
import com.reviewlivro.ReviewLivro.dtos.UsuarioRespostaDto;
import com.reviewlivro.ReviewLivro.servico.UsuarioServico;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/usuarios")
public class UsuarioControlador {

    private final UsuarioServico usuarioServico;

    public UsuarioControlador(UsuarioServico usuarioServico){
        this.usuarioServico = usuarioServico;
    }

    @GetMapping
    public List<UsuarioRespostaDto> get(){
        return usuarioServico.buscarTodos();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED) //resposta 200
    public UsuarioRespostaDto post (@RequestBody UsuarioRequisicaoDto dto){
        return usuarioServico.criarUsuario(dto);
    }

    @PutMapping("/{id}")
    public UsuarioRespostaDto put (@PathVariable Long id, @RequestBody UsuarioRequisicaoDto dto){
        return usuarioServico.atualizar(id, dto);
    }



}

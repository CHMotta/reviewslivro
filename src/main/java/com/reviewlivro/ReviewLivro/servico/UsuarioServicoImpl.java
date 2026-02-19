package com.reviewlivro.ReviewLivro.servico;


import com.reviewlivro.ReviewLivro.dtos.UsuarioRequisicaoDto;
import com.reviewlivro.ReviewLivro.dtos.UsuarioRespostaDto;
import com.reviewlivro.ReviewLivro.entidades.UsuarioEntidade;
import com.reviewlivro.ReviewLivro.enums.PerfilUsuarioEnum;
import com.reviewlivro.ReviewLivro.repositorio.UsuarioRepositorio;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class UsuarioServicoImpl implements UsuarioServico{

    private final UsuarioRepositorio usuarioRepositorio;
    public UsuarioServicoImpl(UsuarioRepositorio usuarioRepositorio) {
        this.usuarioRepositorio = usuarioRepositorio;
    }


    // Metodo vindo da interface usuarioServico
    @Override
    //modificador / tipagem / nome do metodo / (tipagem do parametro e parametro)
    public UsuarioRespostaDto criarUsuario(UsuarioRequisicaoDto dto) {
        //cria um novo objeto usuario
        UsuarioEntidade usuarioEntidade = new UsuarioEntidade();
        //utilizando os parametros passados do dto seta os atributos do objeto
        usuarioEntidade.setNome(dto.nome());
        usuarioEntidade.setSenha(dto.senha()); //fazer codificação da senha no futuro
        usuarioEntidade.setBio(dto.bio());
        usuarioEntidade.setPerfil(PerfilUsuarioEnum.USUARIO);
        //salva os dados no repositorio
        UsuarioEntidade usuarioSalvo = usuarioRepositorio.save(usuarioEntidade);
        //como tipagem é de resposta dto, pega os valores da entidade e transforma no objeto resposta DTO
        return new UsuarioRespostaDto(
                usuarioSalvo.getId(), //garante que o id não seja nulo
                usuarioSalvo.getNome(),
                usuarioSalvo.getPerfil(),
                usuarioSalvo.getBio()
        );
    }


}



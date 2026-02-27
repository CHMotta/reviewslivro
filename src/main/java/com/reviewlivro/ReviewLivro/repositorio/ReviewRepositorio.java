package com.reviewlivro.ReviewLivro.repositorio;

import com.reviewlivro.ReviewLivro.entidades.ReviewEntidade;
import com.reviewlivro.ReviewLivro.entidades.UsuarioEntidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ReviewRepositorio extends JpaRepository<ReviewEntidade, Long> {





}

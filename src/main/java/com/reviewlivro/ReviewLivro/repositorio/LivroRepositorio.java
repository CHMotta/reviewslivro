package com.reviewlivro.ReviewLivro.repositorio;

import com.reviewlivro.ReviewLivro.entidades.LivroEntidade;
import com.reviewlivro.ReviewLivro.entidades.ReviewEntidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LivroRepositorio extends JpaRepository<LivroEntidade, Long> {





}

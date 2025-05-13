package com.projeto.sistema.escolar.repositoys;

import com.projeto.sistema.escolar.models.entities.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}

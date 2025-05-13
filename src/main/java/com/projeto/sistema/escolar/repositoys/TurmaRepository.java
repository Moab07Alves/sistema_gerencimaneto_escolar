package com.projeto.sistema.escolar.repositoys;

import com.projeto.sistema.escolar.models.entities.Turma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurmaRepository extends JpaRepository<Turma, Long> {
}

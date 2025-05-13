package com.projeto.sistema.escolar.repositoys;

import com.projeto.sistema.escolar.models.entities.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}

package com.rer.backend.repositorios;

import com.rer.backend.modelos.ExperienciaLaboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaLaboralRepositorio extends JpaRepository<ExperienciaLaboral, Long> {   
}

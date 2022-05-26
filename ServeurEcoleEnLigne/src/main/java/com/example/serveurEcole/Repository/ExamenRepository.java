package com.example.serveurEcole.Repository;

import com.example.serveurEcole.Models.Examen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamenRepository extends JpaRepository<Examen,Long> {
}

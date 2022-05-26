package com.example.serveurEcole.Repository;

import com.example.serveurEcole.Models.Formation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormationRepository extends JpaRepository<Formation,Long> {
}

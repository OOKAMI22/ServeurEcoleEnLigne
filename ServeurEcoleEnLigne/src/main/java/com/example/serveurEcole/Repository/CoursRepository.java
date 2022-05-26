package com.example.serveurEcole.Repository;

import com.example.serveurEcole.Models.Cours;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursRepository extends JpaRepository<Cours,Long> {
}

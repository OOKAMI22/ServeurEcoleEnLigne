package com.example.serveurEcole.Repository;


import com.example.serveurEcole.Models.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note,Long> {
}
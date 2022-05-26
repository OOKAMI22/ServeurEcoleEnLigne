package com.example.serveurEcole.Controlers;

import com.example.serveurEcole.Models.*;
import com.example.serveurEcole.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
public class FormationControlers {

    @Autowired
    private FormationRepository formationRepository;

    @Autowired
    private CoursRepository coursRepository;

    @Autowired
    private UserRepository user;

    @Autowired
    ExamenRepository examenRepository;

    @Autowired
    NoteRepository noteRepository;

    private static final String uri = "EcoleEnLigne/formation";

    @PostMapping(uri + "/GetFormation")
    public List<Formation> GetFormation() {
        System.out.println("ICI");
        return formationRepository.findAll();
    }

    @PostMapping(uri + "/FormationById")
    public Formation GetFormationById(@RequestBody Long id) {
        return formationRepository.findById(id).get();
    }

    @PostMapping(uri + "/GetCours")
    public List<Cours> GetCours() {
        System.out.println("ICI");
        return coursRepository.findAll();
    }

    @PostMapping(uri + "/GetMesCours")
    public List<Cours> GetMesCours(@RequestBody long idFormation) {
        List<Cours> mesCours = new ArrayList<Cours>();
        for (Cours c : coursRepository.findAll()) {
            if (c.getIdFormation() == idFormation) {
                mesCours.add(c);
            }
        }
        return mesCours;
    }
    @ResponseStatus(HttpStatus.CREATED)
    @PutMapping(uri + "/AddCours")
    public Cours addCours(@RequestBody Cours cours) {
        System.out.println(cours.getTitre());
        return coursRepository.save(cours);
    }

    @PostMapping(uri + "/GetExamens")
    public List<Examen> GetExamen() {
        System.out.println(examenRepository.findAll().get(0).getIdFormation());
        return examenRepository.findAll();
    }
    @PostMapping(uri + "/GetMesExamens")
    public List<Examen> GetMesExamens(@RequestBody long idFormation) {
        List<Examen> mesExamens = new ArrayList<Examen>();
        for (Examen e : examenRepository.findAll()) {
            if (e.getIdFormation() == idFormation) {
                mesExamens.add(e);
            }
        }
        return mesExamens;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PutMapping(uri + "/AddExamen")
    public Examen addExamen(@RequestBody Examen examen) {
        System.out.println(examen.getTitre());
        return examenRepository.save(examen);
    }

    @PostMapping(uri + "/GetNoteByIds")
    public Note GetNoteByIds(@RequestBody Note note) {
        long idEtudiant = note.getIdEdtudiant();
        long idExamen = note.getIdExamen();

        for(Note n : noteRepository.findAll() ){
            if(n.getIdEdtudiant() == idEtudiant && n.getIdExamen() == idExamen){
                return n;
            }
        }
        return null;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PutMapping(uri + "/AddNote")
    public Note addNote(@RequestBody Note note) {
        System.out.println("J'ai ajouté la note suivante "+note.getNote());
        return noteRepository.save(note);
    }

}

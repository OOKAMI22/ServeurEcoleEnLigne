package com.example.serveurEcole.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Note {
    @Id
    @GeneratedValue
    private long id;

    @Column(name = "IDETUDIANT")
    private long idEdtudiant;
    @Column(name = "IDEXAMEN")
    private long idExamen;
    @Column(name = "NOTE")
    private int note;
    @Column(name = "BASE")
    private int base;

    public Note() {}
    public Note(long idEdtudiant, long idCours, int note, int base) {
        this.idEdtudiant = idEdtudiant;
        this.idExamen = idCours;
        this.note = note;
        this.base = base;
    }



    public Long getId() {
        return id;
    }

    public long getIdEdtudiant() {
        return idEdtudiant;
    }

    public void setIdEdtudiant(long idEdtudiant) {
        this.idEdtudiant = idEdtudiant;
    }

    public long getIdExamen() {
        return idExamen;
    }

    public void setIdExamen(long idExamen) {
        this.idExamen = idExamen;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }
}

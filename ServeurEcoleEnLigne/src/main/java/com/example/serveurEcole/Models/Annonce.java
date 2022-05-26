package com.example.serveurEcole.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Annonce {
    @Id
    @GeneratedValue
    private long id;


    @Column(name = "TYPE")
    private TypeAnnonce type;

    @Column(name = "CONTENU")
    private String contenu;



    public Annonce() {
    }


    public Annonce(TypeAnnonce type, String contenu) {
        this.type = type;
        this.contenu = contenu;
    }

    public long getId() {
        return id;
    }


    public TypeAnnonce getType() {
        return type;
    }

    public void setType(TypeAnnonce type) {
        this.type = type;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

}

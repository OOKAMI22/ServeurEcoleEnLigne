package com.example.serveurEcole.Models;



import javax.persistence.*;

import java.util.*;

@Entity
public class Formation {
    @Id
    @GeneratedValue
    private long id;
    @Column(name = "TITRE")
    private String titre;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "DUREE")
    private int duree;
    @Column(name = "PRIX")
    private float prix;

    public Formation() {}

    public Formation(String titre, String description, float prix, int duree) {
        this.titre = titre;
        this.description = description;
        this.prix = prix;
        this.duree = duree;
    }

    public long getId() {
        return this.id;
    }

    public String getTitre() {
        return this.titre;
    }

    public String getDescription() {
        return this.description;
    }

    public float getPrix() {
        return this.prix;
    }

    public int getDuree() {
        return this.duree;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }



}

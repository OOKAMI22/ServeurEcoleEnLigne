package com.example.serveurEcole.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Cours {
    @Id
    @GeneratedValue
    private long id;


    @Column(name = "TITRE")
    private String titre;
    @Column(name = "CONTENU")
    private String contenu;
    @Column(name = "NBHEURE")
    private int nbHeure;
    @Column(name = "IDModerateur")
    private long id_moderateur;
    @Column(name = "IDFORMATION")
    private long id_formation;







    public Cours( String titre, String contenu,int nbheure,long id_moderateur,long id_formation) {
        this.titre = titre;
        this.contenu = contenu;
        this.nbHeure = nbheure;
        this.id_formation = id_formation;
        this.id_moderateur = id_moderateur;
    }

    public Cours() {

    }

    public long getId() {
        return this.id;
    }
    public String getTitre() {
        return this.titre;
    }
    public String getContenu() {
        return this.contenu;
    }
    public int getNbHeure() {
        return this.nbHeure;
    }
    public long getIdFormation() {
        return this.id_formation;
    }

}

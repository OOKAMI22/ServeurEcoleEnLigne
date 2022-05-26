package com.example.serveurEcole.Models;

import javax.persistence.*;

@Entity
public class Etudiant extends Utilisateur {
    @Column(name = "MOYENNE")
    private float moyenne;

    @Column(name = "ID_FORMATION")
    private Long id_formation;


    public Etudiant(){
        super();
    }
    public Etudiant(String pays, String Image , String nom, String prenom, String email, String numero, String mot_de_passe,float moyenne,Formation formation){
        super( pays, Image,nom, prenom, email, numero, mot_de_passe);
        this.moyenne = moyenne;
        this.id_formation = formation.getId();

    }
    public Etudiant(String pays, String Image , String nom, String prenom, String email, String numero, String mot_de_passe,float moyenne,long formation){
        super( pays, Image,nom, prenom, email, numero, mot_de_passe);
        this.moyenne = moyenne;
        this.id_formation = formation;

    }

    public void setMoyenne(float moyenne) {
        this.moyenne = moyenne;
    }

    public void setId_formation(Long id_formation) {
        this.id_formation = id_formation;
    }
    public float getMoyenne() {
        return moyenne;
    }

    public Long getId_formation() {
        return id_formation;
    }

}

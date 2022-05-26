package com.example.serveurEcole.Models;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

@Entity
public class Examen {


    @Id
    @GeneratedValue
    private long id;
    @Column(name = "TITRE")
    private String titre;

    @Column(name = "IDMODERATEUR")
    private long id_moderateur;

    @ElementCollection
    @CollectionTable(name="REPONSE")
    private Map<String, String> listeReponse = new HashMap<>();

    @Column(name = "IDFORMATION")
    private long id_formation;

    public Examen(){}
    public Examen(String titre,long id_moderateur,Map<String, String> listeReponse,long id_formation) {
        this.titre = titre;
        this.id_moderateur = id_moderateur;
        this.listeReponse = listeReponse;
        this.id_formation = id_formation;
    }
    public long getId_moderateur() {
        return this.id_moderateur;
    }
    public Map<String, String> getListeReponse() {
        return this.listeReponse;
    }
    public long getIdFormation() {
        return this.id_formation;
    }
    public String getTitre() {return this.titre;}

}

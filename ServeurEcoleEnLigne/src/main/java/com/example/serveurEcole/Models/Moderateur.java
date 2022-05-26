package com.example.serveurEcole.Models;

import javax.persistence.*;

@Entity
public class Moderateur extends Utilisateur {

    @Column(name = "Grade")
    private Grade grade;




    public Moderateur(){
        super();
    }
    public Moderateur(String pays, String Image , String nom, String prenom, String email, String numero, String mot_de_passe,Grade grade){
        super(pays,Image,nom, prenom, email, numero, mot_de_passe);
        this.grade = grade;
    }
    public Grade getGrade() {
        return this.grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

}

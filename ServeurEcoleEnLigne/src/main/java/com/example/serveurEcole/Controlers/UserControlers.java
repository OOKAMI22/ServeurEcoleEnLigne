package com.example.serveurEcole.Controlers;

import com.example.serveurEcole.Models.*;
import com.example.serveurEcole.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserControlers {


    @Autowired
    private ModerateurRepository moderateurRepository;

    @Autowired
    private EtudiantRepository etudiantRepository;



    @Autowired
    private UserRepository userRepository;


    private static final String uri = "EcoleEnLigne/utilisateur";

    @ResponseStatus(HttpStatus.CREATED)
    @PutMapping(uri + "/InscriptionEtudiant")
    public Etudiant GetUserById(@RequestBody Etudiant etudiant) {
        System.out.println(etudiant.getNom());
        return etudiantRepository.save(etudiant);
    }


    @PostMapping(uri + "/ConnexionEtudiant")
    public Etudiant GetConnexionEtudiant(@RequestBody Utilisateur utilisateur) {
        String email = utilisateur.getEmail();
        String password = utilisateur.getMot_de_passe();
        System.out.println(email);
        System.out.println(password);
        for(Etudiant u : etudiantRepository.findAll() ){
            if(u.getEmail().equals(email) && u.getMot_de_passe().equals(password)){
                System.out.println(u.getId_formation());
                return u;
            }
        }
        return null;
    }
    @PostMapping(uri + "/ConnexionModerateur")
    public Utilisateur GetConnexionModerateur(@RequestBody Utilisateur utilisateur) {
        String email = utilisateur.getEmail();
        String password = utilisateur.getMot_de_passe();
        System.out.println(email);
        System.out.println(password);
        for(Moderateur u : moderateurRepository.findAll() ){
            if(u.getEmail().equals(email) && u.getMot_de_passe().equals(password)){
                return u;
            }
        }
        return null;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PutMapping(uri + "/ChangerMdp")
    public Utilisateur changerMdp(@RequestBody Utilisateur user) {
        System.out.println(user.getNom());
        String email = user.getEmail();
        String password = user.getMot_de_passe();
        for (Utilisateur u : userRepository.findAll()) {
            if (u.getEmail().equals(email)) {
                u.setMot_de_passe(password);
                System.out.println(u.getMot_de_passe());
                return userRepository.save(u);

            }
        }
        return null;
    }

}

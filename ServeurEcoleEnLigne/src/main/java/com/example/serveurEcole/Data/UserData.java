package com.example.serveurEcole.Data;

import com.example.serveurEcole.Models.*;
import com.example.serveurEcole.Repository.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class UserData {
    private Logger logger = LoggerFactory.getLogger(UserData.class);


    @Bean
    public CommandLineRunner initDatabase(ModerateurRepository moderateurRepository, EtudiantRepository etudiantRepository, FormationRepository formationRepository, ExamenRepository examenRepository, CoursRepository coursRepository) {
        return args -> {

            //Formation python = new Formation("Python","Base du langage phare du machine learning",75,45);
            //formationRepository.save(python);
            Formation proba = new Formation("Probabilité","Base des calculs de probabilités",50,30);
            formationRepository.save(proba);
            Formation python = new Formation("Python","Base du langage phare du machine learning",75,45);
            formationRepository.save(python);

            Etudiant kenzaE = new Etudiant("France","","BOUMAZA","Kenza","kenza.boumaza@etu.umontpellier.fr","0754462445","azerty",0,python);
            etudiantRepository.save(kenzaE);
            Etudiant sabrineE = new Etudiant("France","","FARAH","Sabrine","sabrine.farah@etu.umontpellier.fr","0612571757","12345",0,proba);
            etudiantRepository.save(sabrineE);

            Moderateur sabrineM = new Moderateur("France","","FARAH","Sabrine","sabrinefarah22@gmail.com","0612571757","12345",Grade.Createur);
            moderateurRepository.save(sabrineM);
            Moderateur kenzaM = new Moderateur("France","","BOUMAZA","Kenza","kenzaboumaza@happymooc.fr","0754462445","azerty",Grade.Createur);
            moderateurRepository.save(kenzaM);

            long idPy = python.getId();
            String contenuPy1 = "Python est un langage de programmation très répandu et facile à apprendre. Il est adapté aussi bien aux débutants qu’aux experts pour sa simplicité, sa syntaxe lisible et sa variété d’usage.";
            String contenuPy2 = "L’installation de Python est très simple ! Rendez-vous sur python.org, choisissez votre système d’exploitation (Mac/Windows/etc.) et cliquez sur le bouton de téléchargement pour installer Python sur votre ordinateur.";
            String contenuPy3 = "Préparez-vous à exécuter votre premier code Python ! 1) Ouvrez Terminal . 2) Écrivez  python . 3) écrivez  print('hello, world!') .3) Appuyez sur Entrée pour voir le résultat.";
            Cours py1 = new Cours("Cours 1 : Pourquoi utiliser Python ?",contenuPy1,2,0,idPy);
            coursRepository.save(py1);
            Cours py2 = new Cours("Cours 2 : Installez Python sur votre ordinateur",contenuPy2,1,0,idPy);
            coursRepository.save(py2);
            Cours py3 = new Cours("Cours 3 : Exécutez votre premier programme Python",contenuPy3,2,0,idPy);
            coursRepository.save(py3);


            Map<String, String> QA1  = new HashMap<String, String>() {{
                put("Python est un langage de programmation", "vrai");
                put("Pour afficher du text on utilise cout(text) en python", "faux");
            }};
            Map<String, String> QA2  = new HashMap<String, String>() {{
                put("Python est un langage de programmation", "vrai");
                put("Pour afficher du text on utilise cout(text) en python", "faux");
            }};
            Examen pyEx1 = new Examen("Examen 1",0,QA1,2);
            examenRepository.save(pyEx1);

            Examen pyEx2 = new Examen("Examen 2",0,QA2,2);
            examenRepository.save(pyEx2);
        };
    }
}

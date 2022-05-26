package com.example.serveurEcole.Repository;


import com.example.serveurEcole.Models.Utilisateur;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface UtilisateurbaseRepository<T extends Utilisateur>
        extends CrudRepository<T, Long> {
    //All methods in this repository will be available in the ARepository,
    //in the BRepository and in the CRepository.
    //...
}
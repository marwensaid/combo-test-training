package com.testtraining.testtraining.myservice;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    // Implémentation des méthodes pour la gestion des utilisateurs
    public String createUser(String username) {
        // Logique pour créer un utilisateur
        return "Utilisateur créé avec succès : " + username;
    }

    public boolean deleteUser(String username) {
        // Logique pour supprimer un utilisateur
        return true;
    }
}

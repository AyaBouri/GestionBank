package com.example.GestionBanque.demo.Service;
import com.example.GestionBanque.demo.Model.Inscription;
import com.example.GestionBanque.demo.Model.Login;
import com.example.GestionBanque.demo.Model.User;
import org.springframework.stereotype.Service;
@Service
public interface IAuthentificationService {
    User registerAdmin(Inscription registerRequest);
    User registerClient(Inscription registerRequest);
    User registerBeneficiary(Inscription registerRequest);

    // Connexion
    String login(Login loginRequest);

    // Déconnexion
    void logout(String token);

    // Validation des rôles ou droits d'accès
    boolean hasRole(String token, String role);

    // Récupération d'informations utilisateur
    User getUserInfo(String token);
}
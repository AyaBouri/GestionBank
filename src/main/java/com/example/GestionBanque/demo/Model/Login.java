package com.example.GestionBanque.demo.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import java.util.List;
@Entity
public class Login {
    @Id
    private String Id;
    private String usernmae;
    private String password;
    @ManyToOne
    private List<User> users;
}
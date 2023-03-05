
package com.miportfolio.SpringBoot.Security.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String nombreUsuario;
    private String email;
    private String password;

    public Usuario() {
    }

    public Usuario(int id, String nombre, String nombreUsuario, String email, String password) {
        this.id = id;
        this.nombre = nombre;
        this.nombreUsuario=nombreUsuario;
        this.email = email;
        this.password = password;
    }
    
    
}

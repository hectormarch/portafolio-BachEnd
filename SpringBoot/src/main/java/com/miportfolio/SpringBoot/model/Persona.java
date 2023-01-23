
package com.miportfolio.SpringBoot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue( strategy=GenerationType.AUTO)
    private Long id;
    private String name;
    private String titulo;
    private String description;
    private String fotoPerfil;
    
    public Persona(){
    }

    public Persona(Long id, String name, String titulo, String description, String fotoPerfil) {
        this.id=id;
        this.name = name;
        this.titulo = titulo;
        this.description = description;
        this.fotoPerfil = fotoPerfil;
    }
    
}

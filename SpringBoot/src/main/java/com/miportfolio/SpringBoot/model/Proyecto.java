
package com.miportfolio.SpringBoot.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@Entity(name="proyect")
public class Proyecto {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String proyectos;
    @ManyToOne(cascade=CascadeType.PERSIST)
    @JoinColumn(name="persona_id")
    private Persona persona;

    public Proyecto() {
    }

    public Proyecto(int id, String proyectos, Persona persona) {
        this.id = id;
        this.proyectos = proyectos;
        this.persona = persona;
    }

    
    
}

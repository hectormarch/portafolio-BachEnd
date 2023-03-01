
package com.miportfolio.SpringBoot.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity (name="persona")
public class Persona {
    @Id
    @GeneratedValue( strategy=GenerationType.AUTO)
    private int id;
    private String nombre;
    private String titulo;
    private String descripcion;
    private String foto_perfil;
   
    
    public Persona(){
      
    }

    public Persona(int id, String nombre, String titulo, String descripcion, String foto_perfil) {
        this.id = id;
        this.nombre = nombre;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.foto_perfil = foto_perfil;
    }
    
    
    

   
    
}

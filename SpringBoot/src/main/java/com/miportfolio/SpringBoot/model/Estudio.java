
package com.miportfolio.SpringBoot.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


import java.sql.Date;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@Entity 
@Table(name="estudio")
public class Estudio {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public Long id;
    public String titulo;
    public String universidad;
    public String descripcion;
    @ManyToOne(cascade=CascadeType.PERSIST)
    @JoinColumn(name="persona_id")
    private Persona persona;
    public Date fecha_inicio;
    public Date fecha_fin;
    

    public Estudio() {
    }

    public Estudio(Long id, String titulo, String universidad, String descripcion, Persona persona, Date fecha_inicio, Date fecha_fin) {
        this.id = id;
        this.titulo = titulo;
        this.universidad = universidad;
        this.descripcion = descripcion;
        this.persona = persona;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
    }

    
}

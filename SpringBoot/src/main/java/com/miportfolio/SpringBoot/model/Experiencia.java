
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

        

@Getter @Setter
@Entity
@Table(name="experiencia")
public class Experiencia {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String trabajo;
    private String empresa;
    private Date fecha_inicio;
    private Date fecha_fin;
    private Long es_trabajo_actual;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="persona_id")
    private Persona persona;
    
    
    public Experiencia() {
    }

    public Experiencia(Long id, String trabajo, String empresa, Date fecha_inicio, Date fecha_fin, Long es_trabajo_actual, Persona persona) {
        this.id = id;
        this.trabajo = trabajo;
        this.empresa = empresa;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.es_trabajo_actual = es_trabajo_actual;
        this.persona = persona;
    }

    

    

    
}

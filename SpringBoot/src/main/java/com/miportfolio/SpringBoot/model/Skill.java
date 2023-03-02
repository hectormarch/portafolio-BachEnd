
package com.miportfolio.SpringBoot.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter @Getter 
@Table(name="skills")
public class Skill {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String skill_name;
    @ManyToOne(cascade=CascadeType.PERSIST)
    @JoinColumn(name="persona_id")
    private Persona persona;
  

    public Skill() {
    }

    public Skill(Long id, String skill_name, Persona persona) {
        this.id = id;
        this.skill_name = skill_name;
        this.persona = persona;
    }

    
    
    
}

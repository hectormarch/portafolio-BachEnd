package com.miportfolio.SpringBoot.Security.Entity;

import com.miportfolio.SpringBoot.Security.enums.RolNombre;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;



@Entity
@Setter @Getter
public class Rol {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @Enumerated(EnumType.STRING)
    private RolNombre rolNombre;
    
    

    public Rol() {
    }

    public Rol(int id, RolNombre rolNombre) {
        this.id = id;
        this.rolNombre = rolNombre;
    }
    
    
}

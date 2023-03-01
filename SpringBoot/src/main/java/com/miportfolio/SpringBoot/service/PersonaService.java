
package com.miportfolio.SpringBoot.service;

import com.miportfolio.SpringBoot.model.Persona;
import com.miportfolio.SpringBoot.repository.PersonaRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
@Transactional
public class PersonaService {

    @Autowired
    public PersonaRepository persoRepo;
    
    
    public List<Persona>verPersona() {
       List<Persona>listaPersonas= persoRepo.findAll();
       return listaPersonas;
    }
    
    public Persona buscarPersona(@PathVariable int id){
        Persona perso=persoRepo.findById(id).orElse(null);
        return perso;
    }

    
    public void agregarPersona(Persona per) {
       persoRepo.save(per);
       
    }

    
    public void eliminarPersona(int id) {
        persoRepo.deleteById(id);
    }
    
    
    public void modificarPersona(Persona per) {
        persoRepo.save(per);
    
    }
    
    
    
}


package com.miportfolio.SpringBoot.service;

import com.miportfolio.SpringBoot.model.Experiencia;
import com.miportfolio.SpringBoot.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class ExperienciaService {
    
    @Autowired
    private ExperienciaRepository expeRepository; 
    

   
    public List<Experiencia> verExperiencia(){
        List<Experiencia> expe=expeRepository.findAll();
        return expe;  
    }

    
    public Experiencia buscarPersona(@PathVariable Long id){
        Experiencia expe=expeRepository.findById(id).orElse(null);
        return expe;
    }

    
    public void agregarExperiencia(Experiencia expe) {
        expeRepository.save(expe);
    }

    
    public void eliminarExperiencia(Long id) {
        expeRepository.deleteById(id);
    }
    
    
    public void modificarExperiencia(Experiencia expe) {
        expeRepository.save(expe);
    
    }
    
}

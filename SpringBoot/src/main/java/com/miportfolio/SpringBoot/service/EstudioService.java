
package com.miportfolio.SpringBoot.service;

import com.miportfolio.SpringBoot.model.Estudio;
import com.miportfolio.SpringBoot.repository.EstudioRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EstudioService {
    
    @Autowired
    public EstudioRepository estuRepo;
    
    public List<Estudio>verEstudios(){
    List<Estudio>listaEstudios=estuRepo.findAll();
    return listaEstudios;
    }
    
    
    public void agregarEstudio(Estudio estu){
        estuRepo.save(estu);
    }
    
    public void eliminarEstudio(Long id){
        estuRepo.deleteById(id);
    }
    
    public void modificarEstudio(Estudio estu){
        estuRepo.save(estu);
    }
    
    
}

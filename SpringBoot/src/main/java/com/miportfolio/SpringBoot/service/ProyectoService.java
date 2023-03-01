
package com.miportfolio.SpringBoot.service;

import com.miportfolio.SpringBoot.model.Proyecto;
import com.miportfolio.SpringBoot.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService {
    
    @Autowired
    public ProyectoRepository proyecRepo;
    
    public List<Proyecto>verProyectos(){
    List<Proyecto>listaRepo=proyecRepo.findAll();
    return listaRepo;
    }
    
    
    public void agregarProyecto(Proyecto proyec){
        proyecRepo.save(proyec);
    }
    
    public void eliminarProyecto(Integer id){
        proyecRepo.deleteById(id);
    }
    
    public void modificarProyecto(Proyecto proyec){
        proyecRepo.save(proyec);
    }
    
}

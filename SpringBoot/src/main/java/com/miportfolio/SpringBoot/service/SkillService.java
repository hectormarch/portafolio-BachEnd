
package com.miportfolio.SpringBoot.service;

import com.miportfolio.SpringBoot.model.Skill;
import com.miportfolio.SpringBoot.repository.SkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService {
    @Autowired
    private SkillRepository skillRepo;
    
    
    public List<Skill>verSkills(){
        List<Skill>listaSkills=skillRepo.findAll();
        return listaSkills;
    }
    
    
    public void agregarSkill(Skill ski){
        skillRepo.save(ski);
    }
    
    public void eliminarSkill(Long id){
        skillRepo.deleteById(id);
    }
    
    public void modificarSkill(Skill ski){
        skillRepo.save(ski);
    }
    
}

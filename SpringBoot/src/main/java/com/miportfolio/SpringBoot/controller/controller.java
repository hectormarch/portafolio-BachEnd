
package com.miportfolio.SpringBoot.controller;

import com.miportfolio.SpringBoot.model.Estudio;
import com.miportfolio.SpringBoot.model.Experiencia;
import com.miportfolio.SpringBoot.model.Persona;
import com.miportfolio.SpringBoot.model.Proyecto;
import com.miportfolio.SpringBoot.service.EstudioService;
import com.miportfolio.SpringBoot.service.ExperienciaService;
import com.miportfolio.SpringBoot.service.PersonaService;
import com.miportfolio.SpringBoot.service.ProyectoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/persona")
@CrossOrigin(origins= "http://localhost:4200")
public class Controller {
    
    //CLASE PERSONA
    
   @Autowired
   PersonaService persoServ;
   
   
   @GetMapping("/lista")
   @ResponseBody
   public List<Persona>verPersona(){
       return persoServ.verPersona();
   }
   
   @GetMapping("/ver/{id}")
   @ResponseBody
   public Persona buscarPersona(@PathVariable int id){
       return persoServ.buscarPersona(id);
   }
  
   
   @PostMapping ("/agregar")
   public void agregarPersona(@RequestBody Persona per){
       persoServ.agregarPersona(per); 
       
   }
    
   @DeleteMapping("/eliminar/{id}")
   public void eliminarPersona(@PathVariable int id){
       persoServ.eliminarPersona(id);

   }
   
   @PutMapping("/modificar")
   public void modidicarPersona(@RequestBody Persona per){
       persoServ.modificarPersona(per);
   }
   
   
    //CLASE EXPERIENCIA
   
  @Autowired
   ExperienciaService expeServ;
    
  
   @GetMapping("/experiencia")
   @ResponseBody
   public List<Experiencia>verExperiencia(){
       return expeServ.verExperiencia();
   }
   
   
   @PostMapping ("/experiencia/agregar")
   public void agregarExperiencia(@RequestBody Experiencia expe){
       expeServ.agregarExperiencia(expe);
   }
   
   
   @DeleteMapping("/experiencia/eliminar/{id}")
   public void eliminarExperiencia(@PathVariable Long id){
      expeServ.eliminarExperiencia(id);
   }
   
   @PutMapping("/experiencia/modificar")
   public void modificarExperiencia(@RequestBody Experiencia expe){
       expeServ.modificarExperiencia(expe);
   }
   
   
   //CLASE ESTUDIO 
   
   @Autowired
   public EstudioService estuServ;
   
   @GetMapping("/estudios")
   @ResponseBody
   public List<Estudio> verEstudios(){
       return estuServ.verEstudios();
   }
   
   @PostMapping("/estudio/agregar")
   public void agregarEstudio(@RequestBody Estudio estu){
      estuServ.agregarEstudio(estu);
   }
   
   @DeleteMapping("/estudio/eliminar{id}")
   public void eliminarEstudio(@PathVariable Long id){
       estuServ.eliminarEstudio(id);
   }
   
   @PutMapping("/estudio/modificar")
   public void modificarEstudio(@RequestBody Estudio estu){
       estuServ.modificarEstudio(estu);
   }
   
   
   //CLASE PROYECTO
   @Autowired
   public ProyectoService proyecServ;
   
   @GetMapping("/proyectos")
   @ResponseBody
   public List<Proyecto> verProyectos(){
       return proyecServ.verProyectos();
   }
   
   @PostMapping("/proyecto/agregar")
   public void agregarProyecto(@RequestBody Proyecto proyec){
      proyecServ.agregarProyecto(proyec);
   }
   
   @DeleteMapping("/proyecto/eliminar{id}")
   public void eliminarProyecto(@PathVariable int id){
       proyecServ.eliminarProyecto(id);
   }
   
   @PutMapping("/proyecto/modificar")
   public void modificarProyecto(@RequestBody Proyecto proyec){
       proyecServ.modificarProyecto(proyec);
   }
   
   
   
   
}

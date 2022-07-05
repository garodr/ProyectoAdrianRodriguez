
package com.porfolioar.arodriguez.Controller;

import com.porfolioar.arodriguez.Entity.Experiencia;
import com.porfolioar.arodriguez.Interface.IExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ExperienciaController {
    @Autowired IExperienciaService iexperienciaService;
    
    @GetMapping ("experiencia/traer")
    public List<Experiencia> getExperiencia(){
        return iexperienciaService.getExperiencia();
    }
    
    @PostMapping ("experiencia/crear")
    public String createExperiencia(@RequestBody Experiencia experiencia){
        iexperienciaService.saveExperiencia(experiencia);
        return "Experiencia Creada";

    }
    
    @DeleteMapping ("experiencia/borrar/{id}")
    public String deleteExperiencia(@PathVariable Long id){
        iexperienciaService.deleteExperiencia(id);
         return "Experiencia borrada";
    }
    
    @PutMapping ("/experiencia/editar/{id}")
    public Experiencia editExperiencia(@PathVariable Long id, 
                                @RequestParam("lugar") String nuevoLugar,
                                @RequestParam("tarea") String nuevaTarea,
                                @RequestParam("duracion") String nuevoDuracion){
        Experiencia experiencia = iexperienciaService.findExperiencia(id);
        experiencia.setLugar(nuevoLugar);
        experiencia.setTarea(nuevaTarea);
        experiencia.setDuracion(nuevoDuracion);
        
        iexperienciaService.saveExperiencia(experiencia);
        return experiencia;
    }
    
    @GetMapping("/experiencia/traer/perfil")
    public Experiencia findExperiencia(){
        return iexperienciaService.findExperiencia((long)1);
    }
   
}

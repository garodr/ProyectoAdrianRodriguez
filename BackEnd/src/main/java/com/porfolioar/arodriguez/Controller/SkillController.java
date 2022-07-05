
package com.porfolioar.arodriguez.Controller;

import com.porfolioar.arodriguez.Entity.Skill;
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
import com.porfolioar.arodriguez.Interface.ISkillService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class SkillController {
    @Autowired ISkillService iskillService;
    
    @GetMapping ("skill/traer")
    public List<Skill> getSkill(){
        return iskillService.getSkill();
    }

    @PostMapping ("skill/crear")
    public String createSkill(@RequestBody Skill skill){
        iskillService.saveSkill(skill);
        return "Skill Creado";

    }
    
    @DeleteMapping ("skill/borrar/{id}")
    public String deleteSkill(@PathVariable Long id){
        iskillService.deleteSkill(id);
         return "Skill borrado";
    }
    
    @PutMapping ("skill/editar/{id}")
    public Skill editSkill(@PathVariable Long id, 
                                @RequestParam("skillnombre") String nuevoSkillNombre,
                                @RequestParam("porcent") Long nuevoPorcent
                                ){
        Skill skill = iskillService.findSkill(id);
        skill.setSkillnombre(nuevoSkillNombre);
        skill.setPorcent(nuevoPorcent);
        return skill;
    }
    
    @GetMapping("skill/traer/perfil")
    public Skill findSkill(){
        return iskillService.findSkill((long)1);
    }
   
}

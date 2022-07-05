
package com.porfolioar.arodriguez.Controller;

import com.porfolioar.arodriguez.Entity.Estudio;
import com.porfolioar.arodriguez.Interface.IEstudioService;
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
public class EstudioController {
    @Autowired IEstudioService iestudioService;
    
    @GetMapping ("estudios/traer")
    public List<Estudio> getEstudio(){
        return iestudioService.getEstudio();
    }
    
    @PostMapping ("estudios/crear")
    public String createEstudio(@RequestBody Estudio estudio){
        iestudioService.saveEstudio(estudio);
        return "Estudio Creado";

    }
    
    @DeleteMapping ("estudios/borrar/{id}")
    public String deleteEstudio(@PathVariable Long id){
        iestudioService.deleteEstudio(id);
         return "Estudio borrado";
    }
    
    @PutMapping ("estudios/editar/{id}")
    public Estudio editEstudio(@PathVariable Long id, 
                                @RequestParam("institucion") String nuevaInstitucion,
                                @RequestParam("titulo") String nuevoTitulo,
                                @RequestParam("duracion") String nuevaDuracion){
        Estudio estudio = iestudioService.findEstudio(id);
        estudio.setInstitucion(nuevaInstitucion);
        estudio.setTitulo(nuevoTitulo);
        estudio.setDuracion(nuevaDuracion);
        
        iestudioService.saveEstudio(estudio);
        return estudio;
    }
    
    @GetMapping("estudios/traer/perfil")
    public Estudio findEstudio(){
        return iestudioService.findEstudio((long)1);
    }
   
}


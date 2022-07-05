
package com.porfolioar.arodriguez.Controller;

import com.porfolioar.arodriguez.Entity.Proyecto;
import com.porfolioar.arodriguez.Interface.IProyectoService;
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
public class ProyectoController {
    @Autowired IProyectoService iproyectoService;
    
    @GetMapping ("proyecto/traer")
    public List<Proyecto> getProyecto(){
        return iproyectoService.getProyecto();
    }
    
    @PostMapping ("proyecto/crear")
    public String createProyecto(@RequestBody Proyecto proyecto){
        iproyectoService.saveProyecto(proyecto);
        return "Proyecto Creado";

    }
    
    @DeleteMapping ("proyecto/borrar/{id}")
    public String deleteProyecto(@PathVariable Long id){
        iproyectoService.deleteProyecto(id);
         return "Proyecto borrado";
    }
    
    @PutMapping ("proyecto/editar/{id}")
    public Proyecto editProyecto(@PathVariable Long id, 
                                @RequestParam("nombrepro") String nuevoNombrepro,
                                @RequestParam("descripcion") String nuevoDescripcion,
                                @RequestParam("imgproyecto") String nuevoImgproyecto,
                                @RequestParam("urlproyecto") String nuevoUrlproyecto) {
        Proyecto proyecto = iproyectoService.findProyecto(id);
        proyecto.setNombrepro(nuevoNombrepro);
        proyecto.setDescripcion(nuevoDescripcion);
        proyecto.setImgproyecto(nuevoImgproyecto);
        proyecto.setUrlproyecto(nuevoUrlproyecto);
        
        iproyectoService.saveProyecto(proyecto);
        return proyecto;
    }
    
    @GetMapping("proyecto/traer/perfil")
    public Proyecto findProyecto(){
        return iproyectoService.findProyecto((long)1);
    }
   
}

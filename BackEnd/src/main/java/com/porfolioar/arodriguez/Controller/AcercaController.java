

package com.porfolioar.arodriguez.Controller;

import com.porfolioar.arodriguez.Entity.Acerca;
import com.porfolioar.arodriguez.Interface.IAcercaService;
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
public class AcercaController {
    @Autowired IAcercaService iacercaService;
    
    @GetMapping ("acerca/traer")
    public List<Acerca> getAcerca(){
        return iacercaService.getAcerca();
    }
    
    @PostMapping ("acerca/crear")
    public String createAcerca(@RequestBody Acerca acerca){
        iacercaService.saveAcerca(acerca);
        return "Acerca de creado";

    }
    
    @DeleteMapping ("acerca/borrar/{id}")
    public String deleteAcerca(@PathVariable Long id){
        iacercaService.deleteAcerca(id);
         return "Acerca de borrado";
    }
    
    @PutMapping ("acerca/editar/{id}")
    public Acerca editAcerca(@PathVariable Long id, 
                                @RequestParam ("acerca") String nuevoAcerca)
    {Acerca acerca = iacercaService.findAcerca(id);
        
        iacercaService.saveAcerca(acerca);
        return acerca;
    }
    
    @GetMapping("acerca/traer/perfil")
    public Acerca findAcerca(){
        return iacercaService.findAcerca((long)1);
    }
   
}

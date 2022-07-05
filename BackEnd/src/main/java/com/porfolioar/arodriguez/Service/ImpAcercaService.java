
package com.porfolioar.arodriguez.Service;

import com.porfolioar.arodriguez.Entity.Acerca;
import com.porfolioar.arodriguez.Interface.IAcercaService;
import com.porfolioar.arodriguez.Repository.IAcercaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author gadrian
 */

@Service
public class ImpAcercaService implements IAcercaService {
    @Autowired IAcercaRepository iacercaRepository;

    @Override
    public List<Acerca> getAcerca() {
        List<Acerca> acerca = iacercaRepository.findAll();
        return acerca;
    }
    @Override
    public void saveAcerca(Acerca acerca) {
        iacercaRepository.save(acerca);
    }

    @Override
    public void deleteAcerca(Long id) {
        iacercaRepository.deleteById(id);
    }

    @Override
    public Acerca findAcerca(Long id) {
        Acerca acerca = iacercaRepository.findById(id).orElse(null);
        return acerca;
    }

   

   
    
}

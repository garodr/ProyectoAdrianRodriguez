

package com.porfolioar.arodriguez.Service;

import com.porfolioar.arodriguez.Entity.Estudio;
import com.porfolioar.arodriguez.Interface.IEstudioService;
import com.porfolioar.arodriguez.Repository.IEstudioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author gadrian
 */

@Service
public class ImpEstudioService implements IEstudioService {
    @Autowired IEstudioRepository iestudioRepository;

    @Override
    public List<Estudio> getEstudio() {
        List<Estudio> estudio = iestudioRepository.findAll();
        return estudio;
    }

    @Override
    public void saveEstudio(Estudio estudio) {
        iestudioRepository.save(estudio);
    }

    @Override
    public void deleteEstudio(Long id) {
        iestudioRepository.deleteById(id);
    }

    @Override
    public Estudio findEstudio(Long id) {
        Estudio estudio = iestudioRepository.findById(id).orElse(null);
        return estudio;
    }
    
}


package com.porfolioar.arodriguez.Service;

import com.porfolioar.arodriguez.Entity.Skill;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.porfolioar.arodriguez.Interface.ISkillService;
import com.porfolioar.arodriguez.Repository.ISkillRepository;

/**
 *
 * @author gadrianRodriguez
 */

@Service
public class ImpSkillService implements ISkillService {
    @Autowired ISkillRepository iskillRepository;

    @Override
    public List<Skill> getSkill() {
        List<Skill> skill = iskillRepository.findAll();
        return skill;
    }

    @Override
    public void saveSkill(Skill skill) {
        iskillRepository.save(skill);
    }

    @Override
    public void deleteSkill(Long id) {
        iskillRepository.deleteById(id);
    }

    @Override
    public Skill findSkill(Long id) {
        Skill skill = iskillRepository.findById(id).orElse(null);
        return skill;
    }

    
    
}

package com.porfolioar.arodriguez.Repository;


import com.porfolioar.arodriguez.Entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISkillRepository extends JpaRepository<Skill, Long> {
}

package com.porfolioar.arodriguez.Interface;


import com.porfolioar.arodriguez.Entity.Skill;

import java.util.List;

public interface ISkillService {
//Traer lista de Skills
   public List<Skill> getSkill();
//Guardar Skills
   public void saveSkill(Skill skill);
//Borrar Skill
   public void deleteSkill(Long id);
//Buscar Skill
   public Skill findSkill(Long id);



}

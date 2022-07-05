package com.porfolioar.arodriguez.Interface;


import com.porfolioar.arodriguez.Entity.Experiencia;

import java.util.List;

public interface IExperienciaService {
//Traer lista de experiencias
   public List<Experiencia> getExperiencia();
//Guardar experiencia
   public void saveExperiencia(Experiencia experiencia);
//Borrar experiencia
   public void deleteExperiencia(Long id);
//Buscar experiencia
   public Experiencia findExperiencia(Long id);



}

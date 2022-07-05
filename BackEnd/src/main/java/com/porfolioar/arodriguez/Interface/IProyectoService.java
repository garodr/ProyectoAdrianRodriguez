package com.porfolioar.arodriguez.Interface;


import com.porfolioar.arodriguez.Entity.Proyecto;

import java.util.List;

public interface IProyectoService {
//Traer lista de proyectos
   public List<Proyecto> getProyecto();
//Guardar Proyectos
   public void saveProyecto(Proyecto proyecto);
//Borrar Proyectos
   public void deleteProyecto(Long id);
//Buscar Proyectos
   public Proyecto findProyecto(Long id);



}

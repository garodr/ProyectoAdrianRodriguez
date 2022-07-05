package com.porfolioar.arodriguez.Interface;


import com.porfolioar.arodriguez.Entity.Acerca;

import java.util.List;

public interface IAcercaService {
//Traer Acerca de 
   public List<Acerca> getAcerca();
//Guardar Acerca de
   public void saveAcerca(Acerca acerca);
//Borrar Acerca de
   public void deleteAcerca(Long id);
//Buscar Acerca de
   public Acerca findAcerca(Long id);



}

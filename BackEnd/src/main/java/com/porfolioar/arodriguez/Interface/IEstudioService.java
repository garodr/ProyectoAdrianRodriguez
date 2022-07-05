package com.porfolioar.arodriguez.Interface;


import com.porfolioar.arodriguez.Entity.Estudio;

import java.util.List;

public interface IEstudioService {
//Traer lista de estudios
   public List<Estudio> getEstudio();
//Guardar Estudio
   public void saveEstudio(Estudio estudio);
//Borrar Estudio
   public void deleteEstudio(Long id);
//Buscar Estudio
   public Estudio findEstudio(Long id);



}


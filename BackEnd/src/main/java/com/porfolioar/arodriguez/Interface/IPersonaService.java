package com.porfolioar.arodriguez.Interface;


import com.porfolioar.arodriguez.Entity.Persona;

import java.util.List;

public interface IPersonaService {
//Traer lista de personas
   public List<Persona> getPersona();
//Guardar Persona
   public void savePersona(Persona persona);
//Borrar persona
   public void deletePersona(Long id);
//Buscar Persona
   public Persona findPersona(Long id);



}

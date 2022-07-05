package com.porfolioar.arodriguez.Entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter @Setter
@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud")
    private String lugar;

    @NotNull
    @Size(min = 1, max = 150, message = "No cumple con la longitud")
    private String tarea;

    @Size(min = 1, max = 50, message = "No cumple con la longitud")
    private String duracion;


}

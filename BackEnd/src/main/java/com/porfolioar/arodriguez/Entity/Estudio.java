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
public class Estudio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud")
    private String institucion;

    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud")
    private String titulo;

    @Size(min = 1, max = 50, message = "No cumple con la longitud")
    private String duracion;


}


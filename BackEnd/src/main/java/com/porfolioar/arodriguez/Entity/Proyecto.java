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
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud")
    private String nombrepro;

    @NotNull
    @Size(min = 1, max = 500, message = "No cumple con la longitud")
    private String descripcion;

    @Size(min = 1, max = 100, message = "No cumple con la longitud")
    private String imgproyecto;
    
    @Size(min = 1, max = 100, message = "No cumple con la longitud")
    private String urlproyecto;
    


}

import { Component, OnInit } from '@angular/core';
import { experiencia } from '../model/experiencia.model';
import { ExperienciaService } from '../service/experiencia.service';

@Component({
  selector: 'app-experiencia',
  templateUrl: './experiencia.component.html',
  styleUrls: ['./experiencia.component.css']
})
export class ExperienciaComponent implements OnInit {

  experiencia: experiencia[]=[];

id?: String='';
lugar: String='';
tarea: String='';
duracion: String='';


constructor(public experienciaService: ExperienciaService) { }

  ngOnInit(): void {

    this.experienciaService.getExperiencia().subscribe(dataExperiencia =>{this.experiencia = dataExperiencia})
  }

}

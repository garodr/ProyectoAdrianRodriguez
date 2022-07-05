import { Component, OnInit } from '@angular/core';
import { estudio } from '../model/estudios.model';
import { EstudioService } from '../service/estudio.service';


@Component({
  selector: 'app-estudios',
  templateUrl: './estudios.component.html',
  styleUrls: ['./estudios.component.css']
})
export class EstudiosComponent implements OnInit {

estudio: estudio[]=[];

id: String='';
institucion: String='';
titulo: String='';
duracion: String='';


constructor(public estudioService: EstudioService) { }

  ngOnInit(): void {

    this.estudioService.getEstudio().subscribe(dataEstudio =>{this.estudio = dataEstudio})
  }
}






import { Component, OnInit } from '@angular/core';
import { proyectos } from '../model/proyectos.model';
import { ProyectosService } from '../service/proyectos.service';

@Component({
  selector: 'app-proyectos',
  templateUrl: './proyectos.component.html',
  styleUrls: ['./proyectos.component.css']
})

export class ProyectosComponent implements OnInit {
  public proyec: proyectos[] = [];
  Proyectos: any;
 
 constructor(public proyectosService: ProyectosService) { }
   
   ngOnInit(): void {
     this.proyectosService.getProyectos().subscribe(datapro => { this.proyec = datapro;
     });
   }
     
 
 }
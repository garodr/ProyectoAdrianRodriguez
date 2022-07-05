import { Component, OnInit } from '@angular/core';
import { acerca } from '../model/acerca.model';
import { persona } from '../model/persona.model';
import { AcercaService } from '../service/acerca.service';
import { PersonaService } from '../service/persona.service';

@Component({
  selector: 'app-acerca-de',
  templateUrl: './acerca-de.component.html',
  styleUrls: ['./acerca-de.component.css']
})
export class AcercaDeComponent implements OnInit {
  persona: persona = new persona("","","");
  acerca: acerca = new acerca("");
  constructor(public personaService: PersonaService, public acercaService: AcercaService) { }
  
  ngOnInit(): void {
    this.personaService.getPersona().subscribe(data =>{this.persona = data});
    this.acercaService.getAcerca().subscribe(data1 =>{this.acerca = data1});
    console.log(this.persona);
    console.log(this.acerca);
  }

}

import { Component, OnInit } from '@angular/core';
import { acerca } from 'src/app/model/acerca.model';
import { persona } from 'src/app/model/persona.model';
//import { AcercaService } from '../service/acerca.service';
//import { PersonaService } from '../service/persona.service';

@Component({
  selector: 'app-panel',
  templateUrl: './panel.component.html',
  styleUrls: ['./panel.component.css']
})
export class PanelComponent implements OnInit {

  persona: persona = new persona("","","");
  acerca: acerca = new acerca("");
  //constructor(public personaService: PersonaService, public acercaService: AcercaService) { }
  
  ngOnInit(): void {
    //this.personaService.getPersona().subscribe(data =>{this.persona = data});
    //this.acercaService.getAcerca().subscribe(data1 =>{this.acerca = data1});
    
  }
}

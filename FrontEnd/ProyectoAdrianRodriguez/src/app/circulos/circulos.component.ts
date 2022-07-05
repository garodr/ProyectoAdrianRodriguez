import { Component, OnInit } from '@angular/core';
import { SkillService } from '../service/skill.service';
import { Skill } from '../model/skill.model';
import { NgCircleProgressModule } from 'ng-circle-progress';



@Component({
  selector: 'app-circulos',
  templateUrl: './circulos.component.html',
  styleUrls: ['./circulos.component.css'],
  providers: [SkillService]
})


export class CirculosComponent implements OnInit {
 public skill: Skill[] = [];
 Skill: any;

constructor(public skService: SkillService) { }
  
  ngOnInit(): void {
    this.skService.getSkill().subscribe(datask => { this.skill = datask;
    });
  }
    

}
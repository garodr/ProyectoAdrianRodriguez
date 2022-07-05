import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { estudio } from '../model/estudios.model';


@Injectable({
  providedIn: 'root'
})
export class EstudioService {
  URL = 'http://localhost:8080/estudios/';
  
  constructor(private http: HttpClient) { }

  public getEstudio(): Observable<estudio[]>{
    return this.http.get<estudio[]>(this.URL+'traer/');
    
  }


}

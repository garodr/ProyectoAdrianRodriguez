import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { NgCircleProgressModule } from 'ng-circle-progress';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { AcercaDeComponent } from './acerca-de/acerca-de.component';
import { EstudiosComponent } from './estudios/estudios.component';
import { ExperienciaComponent } from './experiencia/experiencia.component';
import { CirculosComponent } from './circulos/circulos.component';
import { ProyectosComponent } from './proyectos/proyectos.component';
import { FooterComponent } from './footer/footer.component';
import { HttpClientModule} from '@angular/common/http';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { PanelComponent } from './panel/panel/panel.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    AcercaDeComponent,
    EstudiosComponent,
    ExperienciaComponent,
    CirculosComponent,
    ProyectosComponent,
    FooterComponent,
    HomeComponent,
    LoginComponent,
    PanelComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgCircleProgressModule.forRoot({}),
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

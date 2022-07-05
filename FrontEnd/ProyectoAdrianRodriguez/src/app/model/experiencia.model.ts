export class experiencia {
    id?: number;
    lugar: String;
    tarea: String;
    duracion: String;

    constructor(lugar: String,tarea: String,duracion: String){
        this.lugar = lugar;
        this.tarea = tarea;
        this.duracion = duracion;
    }

}
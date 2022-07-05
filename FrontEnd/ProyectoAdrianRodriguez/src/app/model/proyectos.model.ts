export class proyectos {
    id?: number;
    nombrepro: String;
    descripcion: String;
    imgproyecto: String;
    urlproyecto: String;

    constructor(nombrepro: String,descripcion: String,imgproyecto: String,urlproyecto: String){
        this.nombrepro = nombrepro;
        this.descripcion = descripcion;
        this.imgproyecto = imgproyecto;
        this.urlproyecto = urlproyecto;
    }

}
class Persona {
    private var nombre:String;
    private var edad:Int;

    constructor(nombre:String, edad:Int){
        this.nombre = nombre;
        this.edad = edad;
    }
    override fun toString():String{
        return "Hola mi nombre es $nombre y mi edad es $edad"
    }
}
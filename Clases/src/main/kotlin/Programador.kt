import Interfaces.InterfazProgramador

class Programador : InterfazProgramador{

    /*
    Inicializar las variables se puede quitar, me lo exige por la clase de datos (ProgramadorData)
     */

    private var nombre:String = "";
    private var edad:Int = 20;
    private var lenguaje:String = "";
    private var empresa:String = "compañia ssl";

    constructor(nombre:String, edad:Int){
        this.nombre = nombre;
        this.edad = edad;
        this.lenguaje = "kotlin";
    }
    constructor(programador:ProgramadorData){
        this.nombre = programador.nombre.toString();
        this.edad = programador.edad;
        this.lenguaje = programador.lenguage.toString();
    }

    fun dataProgramador():String{
      return "Mi nombre es $nombre y mi edad es $edad y mi lenguaje favorito es $lenguaje";
    }

     fun getName():String{
         return nombre;
     }
    fun getAge():Int{
        return edad;
    }
    fun getLanguage():String{
        return lenguaje;
    }

    override fun experiencia(annos: Int) {
        println("El tiene $annos en la empresa");
    }

    override fun empresaProgramador():String {
        return empresa;
    }

    override fun toString():String{
        return "Mi nombre es $nombre, tengo $edad años y mi lenguaje es $lenguaje";
    }
}

data class ProgramadorData(

    var nombre:String?,
    var edad:Int,
    var lenguage:String?
)
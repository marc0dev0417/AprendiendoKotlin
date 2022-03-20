package Clase

import ClaseDatos.ProgrammerData
import Interfaces.ProgramadorInterface

class Programador : ProgramadorInterface{

    private var name:String;
    private var age:Int;
    private var language:String;

    constructor(programador:ProgrammerData){
        this.name = programador.name;
        this.age = programador.age;
        this.language = programador.language;
    }

    override fun getProgrammerData(): ProgrammerData {

        var programador = ProgrammerData(getName(), getAge(), getLanguage());

        return programador;

    }

    private fun getName():String{
        return name;
    }
    private fun getAge():Int{
        return age;
    }
    private fun getLanguage():String{
        return language;
    }

}
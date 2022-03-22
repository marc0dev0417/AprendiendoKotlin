fun main(args: Array<String>) {

botSeguridad()

}

fun botSeguridad(){
    var persona = Persona("Marco", 20, listOf("Programar", "Jugar", "Hablar"))

    if(persona.name == "Marco"){
        println("Exito y continuar")
    }else{
        print("Nombre incorrecto")
    }

    if(persona.age in 0..17){
        println("Eres menor de edad y acceso denegado")
    }else if(persona.age in 18..64){
        println("Eres bienvenido")

        println("Tus hobbies son -->")
        for(hobbie:String in persona.hobbies){
            println(hobbie)
        }
    }

}
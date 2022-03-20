class Persona(private val nombre:String, private val edad:Int) {

   fun presentacion(){
        println("Hola soy $nombre y mi edad es $edad");
    }
    fun getName():String{
        return nombre;
    }
    fun getAge():Int = edad;
}

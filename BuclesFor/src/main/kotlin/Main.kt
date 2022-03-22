fun main(args: Array<String>) {
buclesFor()
}

fun buclesFor(){
    val miLista:ArrayList<Int> = arrayListOf(1,2,3,4,5,6,7,8,9,10)
    val listaPersona:ArrayList<Persona> = arrayListOf()

    listaPersona.add(Persona("Marco", 20))
    listaPersona.add(Persona("Antonio", 21))



    //ForEach
    for(numero:Int in miLista){
        println(numero)
    }

    println("\n")

    println(listaPersona.size)

    //For normal => (downto, in 0..10 etc)
    for(index in 0 until listaPersona.size step 1){
        println(listaPersona[index])
    }

}
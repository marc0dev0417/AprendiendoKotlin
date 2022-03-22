fun main(args: Array<String>) {

    val numero:Int

    try{
        print("Introduce un número -->")
        numero = readln().toInt()
    }catch (error:Exception){ // O cogerlos desde la consola(Personalizados), Exception es generico
        println(error.message)
    }
}
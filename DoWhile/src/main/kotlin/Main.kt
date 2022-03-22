fun main(args: Array<String>) {

    var numero:Int

    do{
        println("Introduce el número -->")
        numero = readln().toInt()

        if (numero == -1){
            println("Ha terminado el programa")
            break
        }
    }while(numero != -1)
}
fun main(args: Array<String>) {

    val limite:Int = 10
    var inicio:Int = 0

    //While normal
    while(inicio < limite){
        println(inicio)
        inicio++
    }

    //While infinito
    /*
    while(true){
        println("voy a las practicas por fin")
    }
    */

    var numero:Int

    print("Introduce el numero --> ")
    numero = readln().toInt()

    while(numero != -1){
        print("Introduce el numero --> ")
        numero = readln().toInt()

        if(numero == -1){
            println("Ha finalizado el programa")
            break;
        }
    }

}

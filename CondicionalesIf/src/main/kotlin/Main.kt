fun main(args: Array<String>) {

    var valorX:Int = 8;
    var valorY:Int = 6;

    var esMayor:Boolean = false;

    if(valorX > valorY){
        esMayor = true
    }else{
        println("$valorY es mayor que $valorX");
    }

    valorY = if(esMayor){
        valorY + 3;
    }else{
        valorY;
    }
    println(valorY);
}
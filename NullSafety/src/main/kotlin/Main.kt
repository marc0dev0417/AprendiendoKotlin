fun main(args: Array<String>) {
    nullSafety();
}

fun nullSafety(){
    val nullString:String? = null;

    println(nullString);

    /*

    //Solo ejecutarse cuando la variable no sea nula
    if(nullString != null){
        println(nullString);
    }
     */

    //En una sola linea si el valor no es null

    nullString?.let {
    println("No hay valores nulos en la variable");
    }?: run { //En el caso de que sea nulo se ejecuta esta parte del codigo
            println("Hay valor nulo");
    }
}
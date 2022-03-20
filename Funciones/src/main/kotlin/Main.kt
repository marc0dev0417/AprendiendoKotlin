import javax.print.DocFlavor.STRING

fun main(args: Array<String>) {

    val palabra:String = "hola mundo";

    imprimir();
    imprimirTexto("hola este es mi funcion con parametros");
    println("La suma de los numeros es => ${suma(2,8)}");

    var numeroArray:IntArray = intArrayOf(1,2,3,4,5,6,7,8);

    println(listaNumeros(numeroArray));

    println("\n");

    println(invertirString(palabra));

    println("\n");

    pasarArrayString(palabra);

    println("\n");

   println( multiplicar(2,4));
}

private fun imprimir(){
    println("Hola buenos dias");
}
private fun imprimirTexto(texto:String){
    println(texto);
}
private fun suma(x:Int, y:Int):Int{
    return (x+y);
}

private fun listaNumeros(lista:IntArray){

        for(index in 0 until  lista.size step 1){
            println(lista[index]);
        }
}
private fun invertirString(string:String):String{

    var invertida:String = "";
    for(index in string.length - 1 downTo 0 step 1){
        invertida += string[index];
    }
    return invertida;
}
private fun pasarArrayString(palabra:String){
    var count:Int = 0;

    var arrayPalabra = palabra.split(" ");

    for(palabra:String in arrayPalabra){
        count++;
        println("Palabra $count $palabra");
    }
}
private fun multiplicar(x:Int, y:Int):Int = x*y;
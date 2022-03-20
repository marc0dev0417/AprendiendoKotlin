fun main(args: Array<String>) {

    operadores();
}
fun operadores(){
    val firstValue = 2;
    val secondValue = 13;

    //Operadores Aritmeticos =>

    //Suma =>
    var resultado = firstValue + secondValue;

    println("El resultado de suma es $resultado");

    //Resta =>
    resultado = secondValue - firstValue;

    println("El resultado de resta es $resultado");

    //Division =>
    resultado = secondValue / firstValue;

    println("El resultado de la division es $resultado");

    //Multiplicacion =>
    resultado = firstValue * secondValue;

    println("El resultado de la multiplicacion es $resultado");

    //Resto =>
    resultado = secondValue % firstValue;

    println("El resto de $secondValue entre $firstValue es $resultado");


    //Operadores de comparacion =>

    //Igualdad.
    val esIgual:Boolean = firstValue == secondValue;
    println("¿El valor $firstValue es igual a $secondValue? $esIgual");

    //Desigualdad.
    val esDesigual:Boolean = secondValue != firstValue;
    println("¿$firstValue es distinto a $secondValue? $esDesigual");

    //Con el resto es igual misma logica que todos los lenguajes de programacion...(>, <, &&, ||, >=, <=)


}
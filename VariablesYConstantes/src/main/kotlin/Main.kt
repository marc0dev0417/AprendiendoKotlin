fun main(args: Array<String>) {

    constantesYVariables();

}
fun constantesYVariables(){
    /*
    1- Nombre para representar el valor de un dato =>
     */
    //Con var las variables pueden ser mutables => (Se puede cambiar su valor)
    //val equivale a constantes y como es evidente no se puede modificar =>
    var myFirstVariable = "Hello world";
    myFirstVariable = "Bye world";


    println("Mi primera variable es $myFirstVariable");
}
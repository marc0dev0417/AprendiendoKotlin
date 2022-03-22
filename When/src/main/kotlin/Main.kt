fun main(args: Array<String>) {
    //whenString();
    whenNumeros();
}
fun whenNumeros() {
    print("Escribe el número ->");
    var numero: Int = readln().toInt();

    while (numero != -1) {
        when (numero) {
            1 -> println("haber estudiado");
            2 -> println("casi te acercas para el 3");
            in 5 .. 10 -> println("aprobado el curso");
        }
        print("Escribe el número ->");
        numero = readln().toInt();
    }
}
    fun whenString() {
        print("Lenguaje de programación ->");
        var lenguaje: String = readln();

        lenguaje = convertirUpper(lenguaje);

        while (lenguaje != "exit") {
            lenguaje = convertirUpper(lenguaje);
            when (lenguaje) {
                "Javascript", "Typescript" -> {
                    println("Has elegido $lenguaje");
                }
                "Java" -> println("Haz elegido Java");
                "Kotlin" -> println("Haz elegido Kotlin");
            }
            print("Lenguaje de programación ->");
            lenguaje = readln();
        }
    }

    fun convertirUpper(string: String): String {
        return string[0].uppercase() + string.substring(1);
    }


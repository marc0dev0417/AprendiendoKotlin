fun main(args: Array<String>) {

    val persona1 = Persona("Marco", 20);

    persona1.presentacion();
    println(persona1.getName());

    val programador = Programador("Antonio", 21);

    var p = ProgramadorData("marquitos", 20, "javaScript")

    val programador2 = Programador(p);

    println(programador2.dataProgramador());

    println("La edad de ${programador.getName()} es ${programador.getAge()}");

}
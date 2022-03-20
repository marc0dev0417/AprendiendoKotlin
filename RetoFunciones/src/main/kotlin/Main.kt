import Clase.Programador
import ClaseDatos.ProgrammerData

fun main(args: Array<String>) {

    var programador = Programador(ProgrammerData("Marco", 20, "JavaScript"));

   println( programador.getProgrammerData());
}
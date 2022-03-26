import java.io.DataInputStream
import java.net.Socket

fun main(args: Array<String>) {

    val socket:Socket = Socket("localhost",5050)

    val dit:DataInputStream = DataInputStream(socket.getInputStream())

    try {
        while (true) {
            println(dit.readUTF())
        }
    }catch (error:Exception){

    }
}
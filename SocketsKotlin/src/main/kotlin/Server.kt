import java.io.DataOutputStream
import java.io.OutputStream
import java.net.ServerSocket

fun main(args: Array<String>) {

    val server:ServerSocket = ServerSocket(5050)

    val dot = DataOutputStream(server.accept().getOutputStream())

    dot.writeUTF("Hola soy el servidor")
}
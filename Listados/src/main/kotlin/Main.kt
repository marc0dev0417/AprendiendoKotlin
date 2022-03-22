fun main(args: Array<String>) {
    listados();
}
fun listados(){
    val lista:List<String> = listOf()
    val listaOtra = listOf<String>()
    val arrayList:ArrayList<String> = arrayListOf()


    //List no es mutable no se puede añadir elementos
    val miLista:List<String> = listOf("Antonio", "Marco", "Iker")

    //ArrayList es mutable se pueden modificar sus elementos
    val miArrayList:ArrayList<String> = arrayListOf("Kotlin", "Javascript", "Typescript", "Java")

    for(nombre:String in miLista){
        println(nombre)
    }

    println("")

  for(index in 0 until miArrayList.size step 1){
      println(miArrayList[index])  //O poner esto miArrayList[index]
  }

}
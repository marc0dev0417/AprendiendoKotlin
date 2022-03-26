fun main(args: Array<String>) {

    val listaNumero:ArrayList<Int> = arrayListOf(2,4,6,1)

    twoSum(listaNumero, 5)
}

fun twoSum(arrayNumero:ArrayList<Int>, numEsperado:Int){

    var isFound:Boolean = false
    var x:Int = 0
    var y:Int = 0

    for(indexX in 0 until arrayNumero.size step 1){
        for (indexY in 1 until arrayNumero.size step 1){
            if(indexX != indexY)
            if((arrayNumero[indexX] + arrayNumero[indexY]) == numEsperado){
                x = indexX
                y = indexY
                isFound = true
            }
        }
    }
    if (isFound){
        println("Se ha encontrado la suma de $numEsperado con los indices $x y el indice $y")
    }
}
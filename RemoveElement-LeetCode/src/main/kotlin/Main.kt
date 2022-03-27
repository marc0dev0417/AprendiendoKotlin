fun main(args: Array<String>) {
    val nums: IntArray = intArrayOf(0,1,2,2,3,0,4,2)
    val numsOtro: IntArray = intArrayOf(3,2,2,3)

    println("Numero total de elememtos en la lista ${removeElement(nums, 2)}")
    println("Numero total de elememtos en la lista ${removeElement(numsOtro, 3)}")

}

fun removeElement(nums: IntArray, `val`: Int): Int {
    var count:Int = 0

    var listaEliminar:ArrayList<Int> = ArrayList()

    for(index in 0 until nums.size){
        listaEliminar.add(nums[index])
    }

    val numero:ArrayList<Int> = arrayListOf(`val`)
    listaEliminar.removeAll(numero)


    for(elementos:Int in listaEliminar){
        count++
    }
    return count
}
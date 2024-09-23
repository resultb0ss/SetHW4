fun main() {
    var array: ArrayList<Int> = arrayListOf(0,6,0,0,2,0,0,0,1,0,5,0)

    for (i in array.indices){
        for (j in 0..array.indices.last - 1){
            if (array[j] == 0){
                var temp = array[j]
                array[j] = array[j + 1]
                array[j + 1] = temp
            }
        }
    }
    println(array)
}
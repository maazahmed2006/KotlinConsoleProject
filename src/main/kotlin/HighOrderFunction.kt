fun main(){

    val integerList : List<Int> = mutableListOf(1,2,3,4,5)

    val squareOfList =  integerList.square {
        x : Int  -> x * x
    }
}

fun <T> List<T>.square(block: (T)-> T) : List<T> {
    val results : List<T> = mutableListOf<T>()
    for(item in this){
        block(item)

    }

    return  results
}
fun main(){
    // basically lambda func means var which is a function

    val isLetter : (Char) -> Boolean = {
        char : Char -> char.isLetter()
    }

    // passing a lambda as a parameter
    fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int ) : Int {
        return operation(a,b)
    }

    val answer : Int = calculate(1 ,2 ){
        x : Int,
        y : Int -> x+y
    }

    val sqr =  {
        x : Int -> x*x
    }

    // lambda with no input and return type
    val printName = {
        str :String -> println("Hello $str")
    }

    printName("maaz")

    val numbers : Array<Int> = arrayOf(1,2,3,4,5)

    val results: List<Int> = numbers.filter {
        it > 5
    }


    val input = "aadsd"
    input.myFilter {
        it.isLetter()
    }
}

fun String.myFilter(predicate: (Char) -> Boolean) : String {
    return buildString {

        for (char in this@myFilter) {

            if (predicate(char))
                append(char)

        }
    }
}


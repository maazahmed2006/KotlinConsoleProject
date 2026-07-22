import kotlin.reflect.typeOf

fun main()
{
    val numbers : Array<Int> = arrayOf(10,20,30,40,50)
    numbers[0] = 100

    // to get first index of array
    numbers.first()
    // to print array
    numbers.contentToString()
    // size of array
    numbers.size
    // looping an array
    // 1. through for each
    for (number in numbers)
    {
        println(number)
    }
    // 2. using indices
    for (i in numbers.indices){
        println(numbers[i])
    }

    // 3. using range
    for(i in 0 until numbers.lastIndex){
        println(numbers[i])
    }

    //4. reverse array print
    for(i in numbers.size-1 downTo 0) {

        println(numbers[i])
    }

    print(numbers.contains(20))

    print(numbers.max())


    print("=================================")

    print(numbers.any {
        it > 20
    })

    

}

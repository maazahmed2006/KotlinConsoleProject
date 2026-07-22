// basic class in kotlin
open class Person(val n : String, val a: Int)
{
    open val name = n
    protected  open val age = a

    fun personDetails(){
        println("Name: $name, age: $age")
    }
}

class Girl() : Person("ali" , 20){
    override val age = 10
    override val name = "maaz"

}

fun main(){
    val p1 = Person("Ali", 20)
    p1.personDetails()

    val g1 = Girl()
    g1.personDetails()

}



package consoleProject

data class FoodItem(
    val id : Int,
    val name : String ,
    val category : String ,
    var price : Double,
    var quantity: Int,
)
{

    var rating: Float? = null
}
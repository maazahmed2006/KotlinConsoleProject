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


    fun displayFoodItem() {
        println(
            "%-5d %-25s %-15s Rs. %-10.2f %-10s Stock: %-3d".format(
                id,
                name,
                category,
                price,
                rating ?: "N/A",
                quantity
            )
        )
    }


}
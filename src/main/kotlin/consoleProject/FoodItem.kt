package consoleProject

class FoodItem(
    val id : String,
    val name : String ,
    val category : String ,
    var price : Double,
    var quantityAvailable : Int,
)
{

    var rating: Float? = null


    fun itemDetail(){
        println("$name $id $category $price $rating")
    }

    fun updatePrice(newPrice: Double){
        price = newPrice
        print("Price has been updated to $price")
    }

    fun isAvailable() : Boolean {
        return quantityAvailable > 0
    }

    fun updateQuantity(quantity : Int){
        if(quantityAvailable - quantity <= 0) {
            throw Exception("Item Out of Stock")
        }
        quantityAvailable -=  quantity
    }


    }
package consoleProject

class FoodItem(
    val id : String,
    val name : String ,
    val category : String ,
    var price : Double,
    var quantity: Int,
)
{

    var rating: Float? = null


    fun display(){
        println("$name $id $category $price $rating")
    }

    fun updatePrice(newPrice: Double){
        price = newPrice
        print("Price has been updated to $price")
    }

    fun isAvailable() : Boolean {
        return quantity > 0
    }

    fun updateQuantity(quantity : Int){
        if(this.quantity - quantity <= 0) {
            throw Exception("Item Out of Stock")
        }
        this.quantity -=  quantity
    }


    }
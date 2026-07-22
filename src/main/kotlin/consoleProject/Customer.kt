package consoleProject

class Customer(
    val name: String,
    val age: Int,
    val email: String,
    password : String,
    val phoneName: String
) {

    private val walletBalance : Double = 0.0
    private val orderHistory : List<Any> = listOf<Any>()
    private val cartHistory : List<Any> = listOf<Any>()

    fun addMoney(){
        // increment balance
    }
    fun addToCart(){
        // add item to cart
    }
    fun removeFromCart(){
        // remove item from cart
    }
    fun clearCart(){
        // delete List Of Cart fully
    }
    fun checkOut(){
        // here we will deduct balance and deduct item quantity
    }
    fun viewOrders(){
        // here we will display the orderHistory
    }

}
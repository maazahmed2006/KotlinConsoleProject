package consoleProject

import java.util.Queue

class Customer(
    val name: String,
    val age: Int,
    val email: String,
    password : String,
    val phoneNumber: String
) {

    private val customerCart : Cart = Cart()

    private var walletBalance : Double = 0.0
    private val orderHistory = listOf<Order>()
//    private val cartHistory  = listOf<Cart>()



    fun addMoney(walletBalance : Double){
        this.walletBalance += walletBalance
    }
    fun addToCart(foodItem: FoodItem , quantity : Int){
        customerCart.addItem(CartItem(foodItem, quantity))
        print("Item Added to Cart!")
    }
    fun displayCart(){
        val items : List<CartItem>  = customerCart.displayCart()
        items.ad
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
package consoleProject

import consoleProject.helpers.getDate
import consoleProject.helpers.getTime
import consoleProject.helpers.myForEach

class Customer(
    val customerName: String,
    val customerEmail: String,
    password : String,
    val phoneNumber: String
) : User (
    name = customerName,
    email = customerEmail,
    phone = phoneNumber,
    password = password,
){

    private val customerCart : Cart = Cart()
    private val orderHistory = mutableListOf<Order>()


    override fun displayProfile() {
        println("Name: $customerName\n" +
                "Phone Number: $phoneNumber\n" +
                "Email: $email")
    }

    fun addToCart(foodItem: FoodItem , quantity : Int){
        customerCart.addItem(CartItem(foodItem, quantity))
        print("Item Added to Cart!")
    }

    fun displayCart() {
        val items : List<CartItem> = customerCart.getCart()
        print("No.   Item Name                 Quantity        Price\n")
        items.myForEach {
                println(
                    "%-5s %-25s %-15d Rs. %-10.2f".format(
                        "",
                        it.foodItem.name,
                        it.quantity,
                        it.foodItem.price
                    )
                )
        }
    }

    fun removeFromCart(choice : Int){
        customerCart.removeItem(choice)
    }

    fun clearCart(){
        customerCart.clearCart()
    }

    fun checkOut() {

        if (customerCart.getCart().isEmpty()) {
            println("Your cart is empty!")
            return
        }

        val total = customerCart.calculateTotal()

        println("====================================")
        println("Total Amount: Rs. $total")
        print("Confirm Order (Y/N): ")

        val choice = readln().first()

        if (choice != 'Y' && choice != 'y') {
            println("Order Cancelled.")
            return
        }

        val order = Order(
            id = orderHistory.size + 1,
            customer = this,
            items = customerCart.getCart().toList(),
            orderDate = getDate(),
            orderTime = getTime()
        )

        order.updateStatus(Status.CONFIRMED)
        orderHistory.add(order)
        order.displayOrder()
        customerCart.clearCart()

        println("====================================")
        println("Order Placed Successfully!")
    }


}
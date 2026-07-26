package consoleProject

import consoleProject.helpers.repeatUntilExit


fun main(){

    val listOfFoodItem : MutableList<FoodItem> = mutableListOf(
        FoodItem(1 , "Burger", "FastFood", 400.0, 10 ),
        FoodItem(2 , "Pizza", "FastFood", 1200.0, 10 ),
        FoodItem(3 , "Mac n Cheese", "FastFood", 500.0, 10 ),
        FoodItem(4 , "Chocolate Cake", "Desert", 700.0, 10 ),
        FoodItem(5 , "Strawberry Shake", "Drinks", 350.0, 10 ),
    )

    print("Welcome to Foodies\n")

    print("=========Enter your Customer Credentials============ ")

    print("\nEnter your Username : ")
    val name = readln()
    print("\nEnter your password : ")
    val password = readln()
    print("\nEnter your email : ")
    val email = readln()
    print("\nEnter your Phone Number : ")
    val phoneNumber = readln()

    val customer = Customer(
        customerName = name,
        customerEmail = email,
        password = password,
        phoneNumber = phoneNumber
    )

    customer.logIn()
    print("===============================CUSTOMER LOGGED IN======================================\n")

    do
    {
        val input = true
        displayMainMenu()
        try{
            val choice : Int = readln().toInt()
            when(choice){
                1   -> viewMenu(listOfFoodItem)
                2   -> addToCart(listOfFoodItem, customer)
                3   -> customer.displayCart()
                4   -> removeItemFromCart(customer)
                5   -> clearCart(customer)
                7   -> checkOut(customer)
            }

        }catch(_ : NumberFormatException){

        }

    }while(input)

}


fun displayMainMenu() {

    println("""
    ====================================================
                  FOODIES MAIN MENU
    ====================================================
    1. View Menu
    2. Add Item to Cart
    3. View Cart
    4. Remove Item from Cart
    5. Clear Cart
    6. Add Money to Wallet
    7. Checkout
    8. View Order History
    9. Exit
    ====================================================
    Enter your choice:
    """)
}

fun viewMenu(foodItem: List<FoodItem>){
    foodItem.forEach {
        println(
            "%-5d %-25s %-15s Rs. %-10.2f %-10s Stock: %-3d".format(
                it.id,
                it.name,
                it.category,
                it.price,
                it.rating ?: "N/A",
                it.quantity
            )
        )
    }
}


fun addToCart(listOfFoodItem: List<FoodItem>, customer: Customer)  {

    repeatUntilExit{
        try {
            viewMenu(listOfFoodItem)
            print("\nSelect your Choice: ")
            val choice: Int = readln().toInt()

            if (choice > listOfFoodItem.size) {
                print("Choice is Not Valid!")
            } else {
                val foodItem: FoodItem = listOfFoodItem[choice - 1]
                print("Enter the quantity: ")
                val quantity: Int = readln().toInt()

                if (quantity <= listOfFoodItem[choice].quantity) {
                    customer.addToCart(foodItem, quantity)
                    foodItem.quantity -= quantity

                } else {
                    print("Item is out of Stock!")
                }
            }
        } catch (_: NumberFormatException) {
            print("Please Enter a Valid Choice")
        }
    }
}


fun removeItemFromCart(customer: Customer) {

    repeatUntilExit{
        try {
            customer.displayCart()
            print("\nEnter the item number to remove: ")
            val input = readln().toInt()
            customer.removeFromCart(input-1)
        } catch (_: NumberFormatException) {
            println("Please enter a valid number.")
        }
    }

}

fun clearCart(customer: Customer){
    print("Clearing Cart will cause all the items to be deleted.\n Are you sure you want to delete: y/n: ")
    val choice = readln().first()
    if(choice == 'y' || choice == 'Y')
        customer.clearCart()
}


fun checkOut(customer: Customer){
    customer.displayCart()
    customer.checkOut()
}





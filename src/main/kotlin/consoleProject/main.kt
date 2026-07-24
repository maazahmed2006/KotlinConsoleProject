package consoleProject

import consoleProject.helpers.myForEach


fun main(){

    val listOfFoodItem : MutableList<FoodItem> = mutableListOf(
        FoodItem(1 , "Burger", "FastFood", 400.0, 10 ),
        FoodItem(2 , "Pizza", "FastFood", 1200.0, 10 ),
        FoodItem(3 , "Mac n Cheese", "FastFood", 500.0, 10 ),
        FoodItem(4 , "Chocolate Cake", "Desert", 700.0, 10 ),
        FoodItem(5 , "Strawberry Shake", "Drinks", 350.0, 10 ),
    )

    print("Welcome to Foodies\n")

//    print("=========Enter your Customer Credentials============ ")
//
//    print("\nEnter your Username : ")
//    val name = readln()
//    print("\nEnter your password : ")
//    val password = readln()
//    print("\nEnter your age : ")
//    val age = readln().toInt()
//    print("\nEnter your email : ")
//    val email = readln()
//    print("\nEnter your Phone Number : ")
//    val phoneNumber = readln()

    val customer : Customer = Customer(
        name = "Maaz",
        age = 29,
        email = "aaasasasa",
        password = "afdrsc",
        phoneNumber = "03335568"
    )

    print("===============================CUSTOMER CREATED======================================\n")


    do
    {
        val input = true
        displayMainMenu()
        try{
            val choice : Int = readln().toInt()
            when(choice){
                1 -> viewMenu(listOfFoodItem)
                2 -> addToCart(listOfFoodItem, customer)
                3-> viewCart {
                    customer.displayCart()
                }
            }

        }catch(_ : NumberFormatException){

        }

    }while(input)

}
fun displayMainMenu() {

    println("====================================================")
    println("              FOODIES MAIN MENU")
    println("====================================================")
    println("1. View Menu")
    println("2. Add Item to Cart")
    println("3. View Cart")
    println("4. Remove Item from Cart")
    println("5. Clear Cart")
    println("6. Add Money to Wallet")
    println("7. Checkout")
    println("8. View Order History")
    println("9. Exit")
    println("====================================================")
    println("Enter your choice: ")
}

fun viewMenu(foodItem: List<FoodItem>){
    foodItem.forEach {
        it.displayFoodItem()
    }
}
// we can simply pass a single object here as well
// we have to implement it here
fun addToCart(listOfFoodItem: List<FoodItem>, customer: Customer)  {
    try {
        displayMainMenu()
        print("\nSelect your Choice: ")
        val choice: Int = readln().toInt()

        if (choice > listOfFoodItem.size)
            print("Choice is Not Valid!")
        else {
            val foodItem: FoodItem = listOfFoodItem[choice]
            print("Enter the quantity: ")
            val quantity: Int = readln().toInt()

            if (quantity <= listOfFoodItem[choice].quantity) {
                customer.addToCart(foodItem, quantity)
                foodItem.quantity -= quantity
                print("\nDo you want to another order? y/n : ")
                val choice : Char = readln().first()

//                if(choice == 'N' || choice == 'n'){
//                }

            } else {
                print("Item is out of Stock!")
            }
        }
    }
    catch (_: NumberFormatException) {
        print("Please Enter a Valid Choice")
    }
}

fun viewCart(block: () -> Unit ){
    block()

}







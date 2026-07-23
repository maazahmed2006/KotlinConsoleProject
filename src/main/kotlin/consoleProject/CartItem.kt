package consoleProject

class CartItem(
    val foodItem : FoodItem,
    var quantity : Int
) {

    fun display()
    {
        print("Your Cart items are")
        print("Item Name: ${foodItem.name}")
        print("Price: ${foodItem.price}")
    }

    fun updateQuantity(newQuantity: Int){
        quantity = newQuantity
    }

    fun calculateSubTotal() : Double{
       return foodItem.price * quantity
    }



}
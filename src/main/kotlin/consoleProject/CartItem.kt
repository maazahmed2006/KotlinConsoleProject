package consoleProject

data class CartItem(
    val foodItem : FoodItem,
    var quantity : Int
) {


    fun calculateSubTotal() : Double{
       return foodItem.price * quantity
    }



}
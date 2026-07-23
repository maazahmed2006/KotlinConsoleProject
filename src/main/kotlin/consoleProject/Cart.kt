package consoleProject

class Cart(
    private var items : MutableList<CartItem> = mutableListOf<CartItem>(),
//    val customer : Customer
)
{

    fun displayItem(){
        print("========Cart Items=========\n")
        items.myForEach {
            print("Item Name: ${it.foodItem.name} \n")
            print("Price: ${it.foodItem.price} \n")
            print("Quantity : ${it.quantity}")
        }
    }

    fun addItem(item: CartItem){
        items.add(item)
    }

    fun removeItem(itemNo : Int){

        if(itemNo < 1 && itemNo >= items.size)
            throw Exception ("Invalid Item Number")

        items.removeAt(itemNo-1)
        print("Item No: $itemNo removed\n")
    }

    fun clearCart(){
        items.clear()
    }




}
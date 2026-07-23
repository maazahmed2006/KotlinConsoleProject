package consoleProject

import consoleProject.helpers.calculateTotal
import consoleProject.helpers.myForEach

class Cart(
    private val items: MutableList<CartItem> = mutableListOf(),
//  val customer : Customer
)
{


    fun getItems() : List<CartItem> = items

    fun display(){
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

        if(itemNo < 1 || itemNo >= items.size)
            throw Exception ("Invalid Item Number")

        items.removeAt(itemNo-1)
        print("Item No: $itemNo removed\n")
    }

    fun clearCart(){
        items.clear()
    }

    fun calculateTotal() : Double {
        return items.calculateTotal()
    }


}
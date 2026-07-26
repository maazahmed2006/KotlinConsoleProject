package consoleProject

import consoleProject.helpers.calculateTotal
import consoleProject.helpers.myForEach

class Cart(
    private val items: MutableList<CartItem> = mutableListOf(),
) {


    fun getCart() : List<CartItem>{
        return items
    }

    fun addItem(item: CartItem){
        items.add(item)
    }

    fun removeItem(itemNo : Int){
        if(itemNo < 0 || itemNo >= items.size){
          throw NumberFormatException("Invalid item number")
        }

        items.removeAt(itemNo-1)
        print("Item No: $itemNo removed\n")
    }

    fun clearCart(){
        if(items.isEmpty()){
            print("Cart is Empty\n")
            return
        }

        items.clear()
        print("Cart is Cleared\n")
    }

    fun calculateTotal() : Double {
        return items.calculateTotal()
    }


}
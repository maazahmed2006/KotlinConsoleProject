package consoleProject

import consoleProject.helpers.calculateTotal
import consoleProject.helpers.myForEach

data class Cart(
    private val items: MutableList<CartItem> = mutableListOf(),
) {

    fun getItems() : List<CartItem> = items

    fun displayCart() : List<CartItem>{
        return items
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
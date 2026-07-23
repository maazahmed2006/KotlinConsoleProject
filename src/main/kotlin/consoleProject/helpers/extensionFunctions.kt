package consoleProject.helpers

import consoleProject.CartItem

fun <T> List<T>.myForEach(block: (T) -> Unit) {
    for (item in this) {
        block(item)
    }
}


fun  List<CartItem>.calculateTotal() : Double{
    var total = 0.0
    for (item in this){
        total += item.calculateSubTotal()
    }
    return  total
}

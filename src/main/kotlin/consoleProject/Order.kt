package consoleProject

import consoleProject.helpers.calculateTotal
import consoleProject.helpers.myForEach

class Order(
    val id : Int,
    val customer : Customer,
    val items : List<CartItem>,
    val orderDate: String,
    val orderTime: String,
) {


    private var status : Status = Status.PENDING


    fun displayOrder() {
        print("============ORDER DETAILS==============")
        print("Customer: ${customer.name}")
        print("Date: $orderDate")

        print("Items:\n")

        items.myForEach {
            print("${it.foodItem.name} x${it.foodItem.quantity}\n")
        }

        print("Total: RS${calculateBill()}")
        print("Status: ${status.message}")

    }

    fun calculateBill() : Double{
        return items.calculateTotal()
    }

    fun updateStatus(status: Status){
        this.status = status
    }



}
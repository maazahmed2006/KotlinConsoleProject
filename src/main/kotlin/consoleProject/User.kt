package consoleProject

abstract class User(
    val name : String,
    val email : String,
    val phone: String,
    private val password: String
) {

    fun logIn(){
        print("You are Logged in with email: $email")
    }
    fun logOut() {
        println("You are Logged Out")
    }
    abstract fun displayProfile()

    }

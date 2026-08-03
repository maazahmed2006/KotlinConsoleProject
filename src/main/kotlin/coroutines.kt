import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds


fun main(){

    print("Hello\n")

    // in console project we do not use coroutine scope because it cannot keep the program alive while suspend is completing
    // so we use run blocking that blocks the main thread and keeps the program running while the suspend completes its work

    CoroutineScope(Dispatchers.IO).launch{
        delay(3000.milliseconds)
        print("Yo")

    }

    // use run blocking to block the thread

    runBlocking {
        delay(300.milliseconds)
        print("Yoo\n")
    }

    print("Done")
}

suspend fun getName() : String {
    delay(300.milliseconds )
    return "Maaz"
}
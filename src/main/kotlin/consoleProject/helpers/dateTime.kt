package consoleProject.helpers

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun getData() : String {

    val date: LocalDateTime = LocalDateTime.now()
    val dateFormatter = DateTimeFormatter.ofPattern("dd MMM yyyy")
    return date.format(dateFormatter)

}

fun getTime() : String {

    val time: LocalDateTime = LocalDateTime.now()
    val timeFormatter = DateTimeFormatter.ofPattern("hh:mm a")
    return time.format(timeFormatter)

}
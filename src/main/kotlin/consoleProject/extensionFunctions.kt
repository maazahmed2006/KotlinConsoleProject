package consoleProject

fun <T> List<T>.myForEach(block : (T) -> Unit) {
    for(item in this ){
        block(item)
    }
}


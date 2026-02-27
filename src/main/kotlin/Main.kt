import kotlinx.coroutines.*

fun main() = runBlocking {
    println("Hello from qwen!")
    println("I can do something!")

    repeat(20) {
        delay(1000)
        println("I'm working")
    }
}
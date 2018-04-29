package rngKotlin

import java.util.*

fun main(args: Array<String>) {
    val random = Random().nextInt(50) + 1

    when (random) {
        in 1..10 -> println("The value $random is in the range of 1 to 10")
        in 11..20 -> println("The value $random is in the range of 11 to 20")
        in 21..30 -> println("The value $random is in the range of 21 to 30")
        in 31..40 -> println("The value $random is in the range of 31 to 40")
        else ->  println("The value $random  is in the range of 41 to 50")
    }
}

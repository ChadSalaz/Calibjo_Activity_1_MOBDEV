package com.example.myapplication

fun main() {
    val numbers = listOf(35, 64, 87, 94, 54, 31)

    var highest = numbers[0]

    for (number in numbers) {
        if (number > highest) {
            highest = number
        }
    }
    println("The highes number is $highest")
}

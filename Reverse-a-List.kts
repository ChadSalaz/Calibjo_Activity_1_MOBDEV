package com.example.myapplication

fun main() {
    val list = listOf(15, 25, 35, 45, 55)
    val reversed = mutableListOf<Int>()

    for (i in list.size - 1 downTo 0) {
        reversed.add(list[i])
    }

    println("Original List: $list")
    println("Reversed List: $reversed")
}

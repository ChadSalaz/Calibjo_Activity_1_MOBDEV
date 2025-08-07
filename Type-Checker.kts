package com.example.myapplication

fun main() {
    // Mixed list with different types
    val mixedList = listOf("Hello", 45, true, 5.94, "World", false)

    // Loop through each item and check its type
    for (item in mixedList) {
        when (item) {
            is String -> println("String detected: \"$item\" ")
            is Int -> println("Integer detected: $item ")
            is Boolean -> println("Boolean detected: It's ${if (item) "true" else "false"}")
            is Double -> println("Double detected: $item")
            else -> println("Unknown type: $item")
        }
    }
}

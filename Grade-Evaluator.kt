package com.example.myapplication

fun main() {
    // Define a list of grades
    val grades = listOf(85, 42, 70, 58, 90)

    // Loop through each grade and evaluate
    for (grade in grades) {
        val result: String
        if (grade > 60) {
            result = "$grade: Pass"
        } else {
            result = "$grade: Fail"
        }
        println(result)
    }
}

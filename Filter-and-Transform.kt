package com.example.myapplication

fun  main(){
    val numbers = 1..20
    val output = numbers.filter { number -> number % 2 ==0}.map {number -> number * 2}

    println("Doubled even numbers: $output")

}

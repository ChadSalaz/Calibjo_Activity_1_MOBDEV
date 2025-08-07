package com.example.myapplication

fun solve(a:Int, b:Int, user:Char): Any {
    return when (user){
        '+' -> a + b
        '-' -> a - b
        '*' -> a * b
        '/' -> a / b
        else -> println("invalid calculation")
    }
}
fun main(){
    println(solve(20,5,'-'))
    println(solve(4,1,'+'))
    println(solve(100,8,'*'))
    println(solve(100,8,'9'))


}

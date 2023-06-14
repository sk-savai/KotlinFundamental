package com.example.myapplication.chapter2

fun main() {
    val day = 1

    val result = when (day) {
        1 ->
            "Sunday"
        2 ->
            "Monday"
        3 ->
            "Thue"
        4 ->
            "Wednesday"
        5 ->
            "Thus"
        6 ->
            "Sat"
        7 ->
            "Sunday"
        else ->
            "Wrong Number"
    }
    println(result)
}
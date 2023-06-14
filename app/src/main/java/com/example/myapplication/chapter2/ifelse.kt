package com.example.myapplication.chapter2

fun main(){

    val a=1044334
    val b=11011222
    val c=90

    val result=if (a>b && a>c) "a is greater" else if (a<b && b>c) " b is greater " else "c is greater"
    println(result)
}
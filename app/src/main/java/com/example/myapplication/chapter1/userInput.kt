package com.example.myapplication.chapter1

fun main(){


    while (true){

        println("Enter A number")
        val num= readLine()

        if (num == "2"){
            println("Stop")
            break
            println("You Entered $num")
        }
    }
    println("Outside loop")

}
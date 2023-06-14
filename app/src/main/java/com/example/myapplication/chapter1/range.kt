package com.example.myapplication.chapter1

fun main(){
    val array= intArrayOf(1,2,3,4,5)

    for (data in array){

        if (data == 2){
            continue
            data++
        }
        println(data)
    }

}
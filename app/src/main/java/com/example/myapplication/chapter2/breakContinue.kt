package com.example.myapplication.chapter2

fun main(){

    var i = 0
    while (i < 10) {
        println(i)
        i++
        if (i == 4) {
            break
        }
    }



    var j = 0
    while (j < 10) {
        println(j)
        j++

        if (j == 4) {
            j++
            continue
        }

    }
}
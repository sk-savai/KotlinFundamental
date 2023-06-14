package com.example.myapplication.chapter2

import java.util.ArrayList

fun main() {
    val list = arrayOf("savai", "sureshbhai", "solanki")
    for (data in list) {
        println(data)
    }

    list.forEach {
        println(it)
    }
    var array = arrayOfNulls<String>(5)
    array[0] = "data0"
    array[1] = "data1"
    array[2] = "data2"
    array[3] = "data3"
    array[4] = "data4"


    array.forEach {
        println(it)
    }

    array = emptyArray()
    for (data in array){
        println(data)
    }
    println(array.size)

    val intArray=Array<Int>(10){
      it
    }
    intArray.forEach {
        println(it)
    }

}
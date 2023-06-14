package com.example.myapplication.chapter1

import kotlin.reflect.typeOf

fun main(){
    val byte:Byte=123                   //8 bits  -2*7 to 2*7 - 1           1 byte
    println(byte)
    val int:Int=133333333               //32 bits  -2*31 to 2*31 - 1        4 byte
    println(int)
    val short:Short=12533               //16 bits  -2*15 to 2*15 - 1        2 byte
    println(short)
    val double:Double=124535535533.373  //64 bits  -2*63 to 2*63 - 1        8 byte
    println(double)
    val float:Float= 3333.2542f         //32 bits  -2*31 to 2*31 - 1        4 byte
    println(float)
    val boolean:Boolean=true            //16 bits  -2*15 to 2*15 - 1        2 byte
    println(boolean)
    val char:Char='a'                   //16 bits  -2*15 to 2*15 - 1        2 byte
    println(char)
    val string:String="Savai Solanki"
    println(string)




}

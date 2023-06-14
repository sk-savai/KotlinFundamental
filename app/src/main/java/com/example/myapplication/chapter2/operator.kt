package com.example.myapplication.chapter2

fun main(){

    var a=10
    var b=20
    var c=10
    //Arithmetic Operator
    println("-------------------------------------------------")

    println(a+b)
    println(a-b)
    println(a*b)
    println(a/b)
    println(a%b)

    println("-------------------------------------------------")

    println(a.plus(b))
    println(a.minus(b))
    println(a.times(b))
    println(a.div(b))
    println(a.rem(b))

    println("-------------------------------------------------")

    //Relation Operator
    println(a<b)
    println(a>b)
    println(a<=b)
    println(a>=b)
    println(a==b)
    println(a!=b)

    // Logical Operator

    val resultAnd=if ( a < b && a==c) " a is less than b and a is equals to c" else "a is not  less than b and a is not equals to c"
    println(resultAnd)

    val resultOr=if ( a > b  || a==b) " a is less than b and a is equals to b" else "a is not  less than b and a is not equals to b"
    println(resultOr)

    val resultNot=if ( a != b) "  a is not equals to b" else " a is  equals to b"
    println(resultNot)

    //Assignment OOperator

    a++
    println(a++)
    println(a)
    ++a
    println(++a)
    println(a)
    a--
    println(a--)
    println(a)
    --a
    println(--a)
    println(a)











}
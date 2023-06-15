package com.example.myapplication.chapter3

import kotlin.math.pow

fun main() {

//    1.Kotlin program to perform arithmetic operations on two numbers

    /*
        val num1=20
        val num2=30

        println(num1+num2)
        println(num1-num2)
        println(num1*num2)
        println(num1/num2)
        println(num1%num2)
    */


//    2.Kotlin program to perform simple calculation on two integer numbers

    /*
        println("Calculation of two integer number")

        val scanner=Scanner(System.`in`)
        println("Enter a number1:")
        val num1=scanner.nextInt()
        println("Enter a number2:")
        val num2=scanner.nextInt()

        println("Enter Any of this: +,-,*,/")
        val arithmetic=scanner.next()

        val result=when(arithmetic){
            "+"-> num1+num2
            "-"-> num1-num2
            "*"-> num1*num2
            "/"-> num1/num2
            "%"-> num1%num2
            else -> {"Invalid Operation"}
        }
        println("The result is: $result")
    */

//    3.Kotlin program to input numbers (integer, float, double) at run time

    /*
        val scanner=Scanner(System.`in`)

        println("Enter a Int number1:")
        val num1=scanner.nextInt()
        println("Int is $num1")

        println("Enter a Float number2:")
        val num2=scanner.nextFloat()
        println("Float is $num2")

        println("Enter a Double number3:")
        val num3=scanner.nextDouble()
        println("Double is $num3")

        println("Enter a Long number4:")
        val num4=scanner.nextLong()
        println("Long is $num4")
    */

//    4.Kotlin program to input a string

    /*
        println("Enter a string :")
        val readLine= readLine()
        println("String Value is : $readLine")
    */

//    5.Kotlin program to find largest of three numbers

    /*
        println("Enter a Three number")

        val scanner=Scanner(System.`in`)
        println("Enter a number1:")
        val num1=scanner.nextInt()
        println("Enter a number2:")
        val num2=scanner.nextInt()
        println("Enter a number3:")
        val num3=scanner.nextInt()

        if (num1>num2 && num1>num3){
            println("$num1 is Greater")
        }else if (num2>num1 && num2>num3){
            println("$num2 is Greater")
        }else{
            println("$num3 is Greater")
        }
    */

//    6.Kotlin program to swap two numbers

    /*
        var num1=10
        var num2=20
        println("Before swap: num1 is : $num1 and num2 is $num2")
        val num3=num2
        num2=num1
        num1=num3
        println("After swap: num1 is : $num1 and num2 is $num2")
    */

//    7.Kotlin program to check whether given number is positive, negative or zero

    /*
        val num=-123
        val result=if (num<0) "num is negative" else if(num == 0) "num is zero" else "num is positive"
        println(result)
    */

//    8.Kotlin program to check whether a number is EVEN or ODD

    /*
        val num=101
        val result=if (num%2==0) "num is even " else "num is odd"
        println(result)
    */

//    9.Kotlin program to print the multiplication table of given number

    /*
        val num=10
        println("Multiplication of $num")

        for (i in 1..10){
            println("$num*$i = ${num*i}")
        }
    */
//    10.Kotlin program to check leap year

    /*
        val num=2000
        val result=if ((num%4==0 || num%400==0) && num%100 !=0) "leap year" else "not leap year"
        println(result)
    */

//    11.Kotlin program to convert distance Miles to KM and KM to Miles

    /*
        val km=2
        val miles=4
        val resultMiles=km/1.609
        val resultKm=miles*1.609
        println("Kilometer $km convert km to miles  is $resultMiles")
        println("Miles $miles convert miles to km  is $resultKm")
    */

//    12.Kotlin program to calculate simple interest

    /*
        val p=500.60
        val r=12.56
        val t=5

        val interest=p*r*t/100

        println("Simple interest is:$interest")
    */

//    13.Kotlin program to calculate compound interest

    /*
        val compoundInterest= compoundInterest(5000,12,5)
        println("compoundInterest is: $compoundInterest")
    */

//    18.Kotlin program to find GCD/HCF of two numbers

    /*
        var num1=6
        var num2=14
        var gcd =1

        num1=if(num1>0) num1 else -num1
        num2=if(num2>0) num2 else -num2

        var i=1
        while ( i<=num1 &&  i<=num2){
            if (num1%i==0 && num2%i==0){
                gcd=i

            }
            i++

        }
        println("GCD IS $gcd")
    */

//    19.Kotlin program to convert temperature from Fahrenheit to Celsius

/*
    val fahrenheit = 67
    val celsius = ((fahrenheit - 32) * 5) / 9
    println("temperature from Fahrenheit to Celsius is $celsius")
*/

//    20.Kotlin program to find factors of a number

/*
    val num: Int = 120
    for (i in 1..num) {
        if (num % i == 0) {
            print(" $i")
        }
    }

    println("---------------------------------------------")

    val number: Int = 120
    val list = arrayListOf<Int>()
    for (i in 1..number) {
        if (number % i == 0) {
            list.add(i)
        }
    }
    println("$number factors is $list")
*/


}

fun compoundInterest(principal: Int, rate: Int, time: Int): Double {
    val amount = principal.toDouble() * ((1 + rate / 100).toDouble()).pow(time.toDouble())
    val interest = amount - principal

    println("Principal: $principal")
    println("Rate of Interest: $rate")
    println("Time Period: $time years")
    println("Amount: $amount")
    println("Interest: $interest")
    return amount

}
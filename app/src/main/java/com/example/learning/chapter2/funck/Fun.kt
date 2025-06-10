package com.example.learning.chapter2.funck

fun calculateArea(width: Double, height: Double): Double = width * height

fun printUserInfo(name: String, age: Int, city: String = "Неизвестен") {
    println("$name, $age, $city")
}

fun Int.isEven(): Boolean {
    return this % 2 == 0
}

fun checkNumber(num: Int) {
    when (num) {
        0 -> println("Ноль")
        in 1..100 -> println("Положительное число")
        in -100..-1 -> println("Отрицательное число")
        else -> {
            if (num > 100) {
                println("Очень большое число")
            }
        }
    }
}

fun forExample() {
    for(i in 0..10) {
        if (i % 2 != 0) {
            println("$i")
        }
    }
}

fun whileExample() {
    var countdown = 5
    while (countdown >= 1) {
        println(countdown)
        countdown--
    }
}

fun main() {
    println(calculateArea(10.0, 10.0))
    println("------------------------------")
    printUserInfo("Rized", 21)
    printUserInfo("Rost", 21, city = "Krasnodar")
    println("------------------------------")
    val number1 = 1
    val number2 = 2
    println(number1.isEven())
    println(number2.isEven())
    println("------------------------------")
    checkNumber(0)
    println("------------------------------")
    forExample()
    println("------------------------------")
    whileExample()
}
package com.example.learning.chapter2

import com.example.learning.chapter2.funck.Product

fun main() {
    val nonImList = listOf("Tagan", "Rostov", "Krasnodar", "Poltavskaya", "Moscow")
    println("${nonImList.first()}, ${nonImList.size}")
    println("-------------------------------------------")
    val imList = mutableListOf(
        Product(1, "Apple", 10.0),
        Product(2, "Orange", 15.0)
    )
    println("$imList")
    imList.add(Product(3, "tapok", 0.0))
    imList.add(Product(4, "tapok", 0.0))
    imList.removeAt(3)
    println("$imList")
    println("-------------------------------------------")
    val nonImSet = setOf("Красный", "Синий", "Зеленый", "Красный")
    println("$nonImSet")
    println("-------------------------------------------")
    val imMap = mutableMapOf("Russia" to "Moscow", "ger" to "ber", "fran" to "par", "shv" to "stok")
    println("$imMap")
    imMap["shv"] = "stoc"
    imMap.remove("ger")
    println("$imMap")
    println("-------------------------------------------")
    val squareLambda: (Int) -> Int = { it * it }
    println(squareLambda(1))
    println(squareLambda(2))
    println(squareLambda(3))
    val sayHelloTo: (String) -> Unit = { println("Привет $it") }
    sayHelloTo("i")
    println("-------------------------------------------")
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(list.filter { it % 2 == 0 })
    println(list.map { it * 3 })
    println("-------------------------------------------")
    val listStr = listOf("apple", "banana", "kiwi", "orange", "grape")
    println(listStr.filter { it.startsWith("a") })
    println(listStr.map { it.length })
    println(listStr.sortedBy { it.length })
}
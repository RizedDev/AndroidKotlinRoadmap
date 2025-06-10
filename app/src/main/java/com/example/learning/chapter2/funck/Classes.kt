package com.example.learning.chapter2.funck

class Book(private val title: String, private val author: String) {
    fun displayInfo() {
        println("$title, $author")
    }
}

data class Product(
    val id: Int,
    val name: String,
    val price: Double
)

fun main() {
    val book1 = Book("1", "2")
    val book2 = Book("3", "4")
    val book3 = Book("5", "6")
    book1.displayInfo()
    book2.displayInfo()
    book3.displayInfo()

    val product1 = Product(1, "", 0.0)
    val product2 = Product(1, "", 0.0)
    println((product1 == product2).toString())
}
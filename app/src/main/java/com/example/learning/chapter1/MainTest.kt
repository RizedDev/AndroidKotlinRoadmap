package com.example.learning.chapter1

fun main() {
    println("Hello, World!")

    val greeting: String = "Hello" // Явно указываем тип String
    val year = 2025 // Тип выводится компилятором (Int)
// greeting = "Hi" // Ошибка! Нельзя изменить val

    var count: Int = 0
    count = 10 // Разрешено

    var name: String = "Alice"
// name = null // Ошибка компиляции!

    var optionalName: String? = "Bob"
    optionalName = null // Разрешено

    val length = optionalName?.length // length будет Int? (nullable Int)

    val nameLength = optionalName?.length ?: 0 // Если optionalName null, nameLength будет 0

    val reallySureName: String? = "Charlie"
    val len = reallySureName!!.length // Потенциальная NPE, если reallySureName был бы null

    if (optionalName != null) {
        println(optionalName.length) // Здесь optionalName автоматически String, а не String?
    }
}
package com.example.learning.chapter3

open class Person(private val name: String, private val age: Int) {
    open fun introduce() {
        println("Привет, меня зовут $name и мне $age лет.")
    }
}

class Student(name: String, age: Int, private val studentId: String) : Person(name, age) {
    override fun introduce() {
        super.introduce()
        println("Мой студенческий ID: $studentId")
    }
}

abstract class PaymentMethod() {
    abstract val type: String
    abstract fun processPayment(amount: Double)
}

class CreditCardPayment(override val type: String, private val cardNumber: String) :
    PaymentMethod() {
    override fun processPayment(amount: Double) {
        println("Plateg proshel poslednie cifry: $cardNumber")
    }
}

class PayPalPayment(override val type: String, private val email: String) : PaymentMethod() {
    override fun processPayment(amount: Double) {
        println("Plateg proshel poslednie cifry: $email")
    }
}

interface Logger {
    fun log(message: String)
}

interface Notifier {
    fun notifyUser(message: String)
    fun sendEmail(address: String, subject: String, body: String) {
        println("Отправлено письмо на $address с темой '$subject'")
    }
}

class AppService: Logger, Notifier {
    override fun log(message: String) {
        println(message)
    }

    override fun notifyUser(message: String) {
        println(message)
    }
}

sealed class NetworkState {
    data class Success(val data: String): NetworkState()
    data class Error(val message: String): NetworkState()
    data object Loading: NetworkState()
    data object Idle: NetworkState()
}

fun displayNetworkStatus(state: NetworkState) {
    when (state) {
        is NetworkState.Success -> println(state.data)
        is NetworkState.Error -> println(state.message)
        is NetworkState.Loading -> println("1")
        is NetworkState.Idle -> println("0")
    }
}

fun main() {
    val person = Person("rized", 21)
    val student = Student("rized", 20, "0")
    person.introduce()
    student.introduce()
    println("---------------------------------------------------------")
    val creditCardPayment = CreditCardPayment("creditCard", "80808080")
    val payPalPayment = PayPalPayment("payPal", "rized@gmail.com")
    creditCardPayment.processPayment(0.0)
    payPalPayment.processPayment(0.0)
    println("---------------------------------------------------------")
    val appService = AppService()
    appService.log("1")
    appService.notifyUser("1")
    appService.sendEmail("1", "0", "0")
    println("---------------------------------------------------------")
    displayNetworkStatus(NetworkState.Success("data"))
    displayNetworkStatus(NetworkState.Error("error"))
    displayNetworkStatus(NetworkState.Loading)
    displayNetworkStatus(NetworkState.Idle)
}
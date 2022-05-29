package com.booking.ashiqfury

import java.util.Scanner

var user: User? = null
var choice = 0
val scanner = Scanner(System.`in`)

fun main() {
    val detail = Details()

    initialScreen()

}

fun initialScreen() {
    do {
        println("""
        1. User
        2. Admin
        3. Exit
    """.trimIndent())
        choice = scanner.nextInt()
        when (choice) {
            1 -> {
                val name = scanner.next()
                val number = scanner.nextLong()
                user = User(name, number)
                user!!.userInitialChoices()
            }
            2 -> {
                val adminName = "Fury"
                val adminNumber = 7309859025
                user = User(adminName, adminNumber)
                user!!.userInitialChoices()
            }
        }
    } while (choice != 3)
}

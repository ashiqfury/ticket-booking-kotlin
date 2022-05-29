package com.booking.ashiqfury

enum class Language {
    Tamil, English, Hindi;
    fun printLanguages() {
        println("Enter the language: ")
        for (i in Language.values()) {
            println("${i.ordinal + 1}. $i")
        }
    }
}

enum class Genre {
    Action, Romance, Horror, Comedy;
    fun printGenre() {
        println("Enter the genre: ")
        for (i in Genre.values()) {
            println("${i.ordinal + 1}. $i")
        }
    }
}

enum class ShowTime {
    Morning, Afternoon, Evening, Night;
    fun printShowTime() {
        println("Enter the show timing: ")
        for (i in ShowTime.values()) {
            println("${i.ordinal + 1}. $i")
        }
    }
}
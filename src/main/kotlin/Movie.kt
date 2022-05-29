package com.booking.ashiqfury

class Movie(name: String, genre: Genre, language: Language, time: ShowTime, price: Int) {
    val id: Int
    val name: String
    val genre: Genre
    val language: Language
    val showTime: ShowTime
    val price: Int
    companion object {
        var movieId = 0
    }

    init {
        Movie.movieId += 1
        this.id = Movie.movieId
        this.name = name
        this.genre = genre
        this.language = language
        this.showTime = time
        this.price = price
    }
}


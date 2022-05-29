package com.booking.ashiqfury

val MOVIES = mutableListOf(
    Movie("Titanic", Genre.Romance, Language.English, ShowTime.Night, 140),
    Movie("Jurassic Park", Genre.Action, Language.Tamil, ShowTime.Evening, 200),
    Movie("Finding Nemo", Genre.Comedy, Language.Hindi, ShowTime.Morning, 100)
)

class Theatre(name: String, location: String, capacity: Int) {
    var id: Int
    val name: String
    val location: String
    val capacity: Int
    var movies: List<Movie>
    var availableSeats: Int = 0
//        set(seatCount) { field -= seatCount }

    companion object {
        var theatreId = 0
    }

    init {
        Theatre.theatreId += 1
        this.id = Theatre.theatreId
        this.name = name
        this.location = location
        this.capacity = capacity
        this.movies = MOVIES
        this.availableSeats = capacity
    }


    fun showAllMovies() {
        for (movie in movies) {
            println("""
                Movie id: ${movie.id}
                Movie name: ${movie.name}
                Movie language: ${movie.language}
                Movie genre: ${movie.genre}
                Movie time: ${movie.showTime}
                Movie price: Rs. ${movie.price}/-
            """.trimIndent())
        }
    }

    fun showAllMoviesNames() {
        for (movie in movies) {
            println("${movie.id}. ${movie.name}")
        }
    }

    fun showTheatreDetails() {
        println("""
            Id: $id
            Name: $name
            Location: $location
            Total seats: $capacity
            Seats available: $availableSeats
            Movies: ${movies.joinToString(", ") { it.name }}
        """.trimIndent())
    }
}
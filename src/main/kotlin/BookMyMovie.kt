package com.booking.ashiqfury

class BookMyMovie(noOfSeats: Int, theatreId: Int, movieId: Int, user: User? = null) {
    val noOfSeats: Int
    val theatreId: Int
    val movieId: Int
    var registeredUser: User?
    var details = Details()

    init {
        this.noOfSeats = noOfSeats
        this.theatreId = theatreId
        this.movieId = movieId
        this.registeredUser = user
    }

    fun bookTicket() {
        val theatre = details.theatres.find { it.id == theatreId }
        val movie = theatre?.movies?.find { it.id == movieId }
        if ((theatre?.availableSeats!! > 0) && (theatre.availableSeats >= noOfSeats)) {
            if (movie != null) {
                print(
                    """
                       Booking successful! 🔥
                                
                                Details:
                                User name: ${registeredUser?.userName}
                                Phone number: ${registeredUser?.phoneNumber}
                                Theatre id: ${theatre.id}
                                Theatre name: ${theatre.name}
                                Location: ${theatre.location}
                                Movie id: ${movie.id}
                                Movie name: ${movie.name}
                                Genre: ${movie.genre}
                                Language: ${movie.language}
                                Ticket Price: Rs. \${movie.price}/-
                                Total Price: Rs. ${movie.price * noOfSeats}/-
                                Time: ${movie.showTime}
                                Thank you...!
                    """.trimIndent()
                )
            }
            theatre.availableSeats -= noOfSeats
            return
        } else {
            println("Seats unavailable! seats available:  ${theatre.availableSeats}")
        }
    }
}
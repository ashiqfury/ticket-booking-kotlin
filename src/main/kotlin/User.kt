package com.booking.ashiqfury

class User(name: String, phoneNumber: Long) {
    val userName: String
    val phoneNumber: Long

    init {
        this.userName = name
        this.phoneNumber = phoneNumber
    }

    fun showUser() {
        println("""
            Username: $userName
            Phone Number: $phoneNumber
        """.trimIndent())
    }

    fun userInitialChoices() {

        do {
            print("""
            1. show theatres list
            2. show movie list
            3. book ticket
            4. exit
            """)
            var choice = scanner.nextInt()
            makeDecision(choice)

        } while(choice != 4)
    }

    fun makeDecision(choice: Int) {
        val detail = Details()
        when (choice) { // mark outerloop
            1 -> {
                detail.showAllTheatres()
            }
            2 -> {
                detail.showTheatresNames()
                println("Enter theatre id: ")
                val theatreId = scanner.nextInt()
                detail.theatres[theatreId - 1].showAllMovies()
            }

            3 -> {
                detail.showTheatresNames()
                println("Enter theatre id: ")
                val theatreId = scanner.nextInt()
                detail.theatres[theatreId - 1].showAllMoviesNames()
                println("Enter movie id: ")
                val movieId = scanner.nextInt()
                println("Enter number of seats: ")
                val seats = scanner.nextInt()
                val book = BookMyMovie(seats, theatreId, movieId, user)
                book.bookTicket()
            }
        }
    }
}
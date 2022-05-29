package com.booking.ashiqfury

val THEATRES = mutableListOf(
    Theatre("Ram", "Tirunelveli", 10),
    Theatre("Muthu Ram", "Tenkasi", 15)
)

class Details {
    var theatres = THEATRES

    fun showAllTheatres() {
        for (theatre in theatres) {
            theatre.showTheatreDetails()
        }
    }

    fun showTheatresNames() {
        for (theatre in theatres) {
            println("${theatre.id}. ${theatre.name}")
        }
    }

    fun addTheatre(name: String, location: String, capacity: Int) {
        theatres.add(Theatre(name, location, capacity))
        println("Theatre $name is added successfully")
    }

    fun removeTheatre(id: Int) {
        theatres = theatres.filter { it.id != id }.toMutableList()
    }
}
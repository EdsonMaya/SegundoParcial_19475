package com.example.segundoparcial_19475

class PersonViewModels {
    init {}

    fun ListaPersonas(): ArrayList<Personas> {
        var people: ArrayList<Personas> = ArrayList<Personas>()

        people.add(Personas(R.drawable.male02, "Estudiante", "Chico", 12))
        people.add(Personas(R.drawable.female01, "Estudiante", "Chica", 14))
        people.add(Personas(R.drawable.male01, "youtuber", "chico", 24))
        people.add(Personas(R.drawable.female02, "profesor", "chica", 32))
        people.add(Personas(R.drawable.male03, "enfermero", "chica", 21))
        people.add(Personas(R.drawable.female03, "pescador", "chico", 16))
        people.add(Personas(R.drawable.male04, "mecanico", "chico", 21))
        people.add(Personas(R.drawable.female04, "cocinero", "chica", 32))

        return people
    }
}
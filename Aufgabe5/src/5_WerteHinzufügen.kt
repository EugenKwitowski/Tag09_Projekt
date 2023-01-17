fun main() {
    val personZuHaustier: MutableMap<String, String> = mutableMapOf(
        "Berta" to "Hunde",
        "Frank" to "Katzen",
        "Luis" to "Mäuse",
        "Sylvia" to "Eulen",
        "Hans" to "Fau"
    )
    //println(personZuHaustier)
    personZuHaustier["Tim"] = "Schildkröte"
    personZuHaustier["Fabian"] = "Papagai"
    personZuHaustier["Jannik"] = "Schlange"
    //println(personZuHaustier)

    personZuHaustier["Lois"] = "Mäuse"
    personZuHaustier["Bernd"] = "Igel"
    println(personZuHaustier)

}
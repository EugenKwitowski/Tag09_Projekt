fun main() {
    val personZuHaustier: Map<String, String> = mapOf(
        "Berta" to "Hunde",
        "Frank" to "Katzen",
        "Luis" to "Mäuse",
        "Sylvia" to "Eulen",
        "Hans" to "Fau"
    )
    //println(personZuHaustier)
    val fransLieblingsTier: String? = personZuHaustier["Frank"]
    val sylviasLieblingsTier: String? = personZuHaustier["Sylvia"]
    val hansLieblingsTier: String? = personZuHaustier["Hans"]

    //println(personZuHaustier[“Frank"])  // Sollte gehen, aber geht nicht

    println("Frank libt $fransLieblingsTier")
    println("Sylvia liebt $sylviasLieblingsTier")
    println("Hans liebt $hansLieblingsTier")


    var hausNummernZuFarben: Map<Int, String> = mapOf(
        12 to "Rot",
        45 to "Blau",
        23 to "Gelb",
        28 to "Grün",
        36 to "Lila",
        92 to "Rosa"
    )
    //println(hausNummernZuFarben)
    var hausFarbe28: String? = hausNummernZuFarben[28]
    var hausFarbe45: String? = hausNummernZuFarben[45]
    var hausFarbe92: String? = hausNummernZuFarben[92]
    var hausFarbe12: String? = hausNummernZuFarben[12]

    println("Hausnummer 28 hat die Farbe: $hausFarbe28")
    println("Hausnummer 45 hat die Farbe: $hausFarbe45")
    println("Hausnummer 92 hat die Farbe: $hausFarbe92")
    println("Hausnummer 12 hat die Farbe: $hausFarbe12")
}
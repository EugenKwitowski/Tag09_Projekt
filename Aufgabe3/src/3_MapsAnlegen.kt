fun main() {
    val personZuHaustier: Map<String, String> = mapOf(
        "Berta" to "Hunde",
        "Frank" to "Katzen",
        "Luis" to "Mäuse",
        "Sylvia" to "Eulen",
    )
    println(personZuHaustier)

    val warenZuPreisen: Map<String, Double> = mapOf(
        "Schokolade" to 1.99,
        "Banane" to 0.29,
        "Yoghurt" to 0.49,
        "Müsli" to 2.99
    )
    println(warenZuPreisen)

    var menschenzuTieren: Map<String, String> = mapOf(
        "Berta" to "Hunde",
        "Frank" to "Katzen",
        "Lois" to "Mäuse",
        "Sylvia" to "Eulen"
    )
    println(menschenzuTieren)

    var hausNummernZuFarben: Map<Int, String> = mapOf(
        12 to "Rot",
        45 to "Blau",
        23 to "Gelb",
        28 to "Grün"
    )
    println(hausNummernZuFarben)
}
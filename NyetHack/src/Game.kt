fun main(args:Array<String>) {
    val name = "Alex"
    var healthPoint = 89
    var isBlessed = true
    var isImmortal = false
    var healthStatus = when(healthPoint){
        100 -> "is in excellent condition"
        in 90..99 -> "has a few scratches"
        in 75..89 -> if(isBlessed) {
            "has some minor wounds but is healing quite quickly"
        } else "has some minor wounds"
        in 15..74 -> "looks pretty hurt"
        else -> "is in awful condition"
        }

    //Aura
    val auraViible = isBlessed && healthPoint > 50 || isImmortal
    val auraColour = if(auraViible) "Green" else "Red"
    println("(Aura:$auraColour)" + " (Bleesed: ${if (isBlessed) "YES" else "NO"})")
    println("$name $healthStatus")

}
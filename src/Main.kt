/**
 * =====================================================================
 * Programming Project for NCEA Level 2, Standard 91896
 * ---------------------------------------------------------------------
 * Project Name:   Old Gold
 * Project Author: Juliet Stevenson
 * GitHub Repo:    https://github.com/waimea-jestevenson/level-2-programing--assessment
 * ---------------------------------------------------------------------
 * Notes:
 *
 * =====================================================================
 */

const val NUMSPACES = 10 //The total of spaces on the bored
const val EMPTY ="---"  // Shows empty spaces on the bored
fun main() {
    println("Old Gold!")
    //Creation of collection for the bored, and set up of the main game
    val gameBored = mutableListOf<Int>()
println(gameBored)

}
//Function to get user input, make sure the input is valid, and add the input to the correct place in the collection
// (Last part might need to be a different function)
fun userInput(gameBored: MutableList<String>) {
    var userInput =readln().toIntOrNull()
when (userInput) {
    null -> println("That is not a valid move")
    else -> println("")
}


}
//Setting up the amount of spaces and coins on the bored 
fun setUpBored(): MutableList<String> {
    val gameBored = mutableListOf<String>()
    for (i in 1..NUMSPACES) gameBored.add(EMPTY)
    return gameBored
}
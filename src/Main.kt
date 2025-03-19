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



fun main() {
    println("Old Gold!")
    //Creation of collection for the bored, and set up of the main game
    val gameBored = mutableListOf<Int>()
    gameBored.add(4)

}
//Function to get user input, make sure the input is valid, and add the input to the correct place in the collection
// (Last part might need to be a different function)
fun userInput(gameBored: MutableList<Int>) {
    var userInput =readln().toIntOrNull()
when (userInput) {
    null -> println("That is not a valid move")
    else -> println("")
}


}

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
const val NUMCOINS = 5   //The Number of coins
const val NUMSPACES = 10 //The total of spaces on the bored
const val EMPTY =" "  // Shows empty spaces on the bored
fun main() {
    println("Old Gold!")
    println("Instructions for Old Gold.")
    //Creation of collection for the bored, and set up of the main game
    val gameBored = setUpBored()
    val coinsOnBored = setUpBored()
    val userMove = ""
    println(coinsOnBored)



}
//Function to get user input, make sure the input is valid, and add the input to the correct place in the collection
// (Last part might need to be a different function)
fun userInput(gameBored: MutableList<String>) {
    val gameBored = mutableListOf<String>()
    var userInput =readln().toIntOrNull()
when (userInput) {
    null -> println("That is not a valid move")
    else -> println("")
}
    gameBored.removeAt(gameBored.size + 1)
    gameBored.add(userInput.toString())
   // remove from current place in the list and put into new place in the list.

//
}
//Setting up the amount of spaces
fun setUpBored(): MutableList<String> {
    val gameBored = mutableListOf<String>()
    for (i in 1..NUMSPACES) gameBored.add(EMPTY)
    return gameBored
}
//putting the coins in random spaces and checking if it's empty
fun placeCoins (gameBored: MutableList<String>): MutableList<String> {
    val coin = gameBored.random()
    while (gameBored.indexOf("0") != NUMCOINS) {
        (coin == EMPTY)
        gameBored.add(EMPTY)
        if (gameBored.indexOf("0") == NUMCOINS) {
            return gameBored
        }
    }
    return TODO("Provide the return value")
}

//When coins == NUMCOINS the loop should break





// Place coins in empty places until there are the same amount of coins as NUMCOINS if there are less the loop continues if there are the same amount the loop breaks
// have one coin that stops the game as soon as it is removed from the bored
//have alternating turns between two human players (possibly add player scores)
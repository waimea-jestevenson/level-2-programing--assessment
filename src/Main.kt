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
    println("The objective of this game is to be the one to take the gold coin off the bored" +
            "Players can do one of two things on their turn, they can either move a coin as many spaces to the left as is possible " +
            "or they can take a coin off the bored if there is one in the left-most space.")
    //Creation of collection for the bored, and set up of the main game
    val gameBored = setUpBored()
    val placeHolder = placeCoins()
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
//Setting up the amount of spaces
fun setUpBored(): MutableList<String> {
    val gameBored = mutableListOf<String>()
    for (i in 1..NUMSPACES) gameBored.add(EMPTY)
    return gameBored
}
//putting the coins in random spaces and checking if it's empty
fun placeCoins (gameBored: MutableList<String>)  {
val coin= gameBored.random()
 when {
     coin.equals(EMPTY) -> gameBored.add("o")
     else ->

 }
}

// Place coins in empty places until there are the same amount of coins as NUMCOINS if there are less the loop continues if there are the same amount the loop breaks
// have one coin that stops (breaks) the game as soon as it is removed from the bored
//have alternating turns between two human players (possibly add player scores)
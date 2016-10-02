package thebottle.song

object Huh {

    fun main(args: Array<String>) {

        var beerNum = 99
        var word = "bottles"

        while (beerNum > 0) {

            if (beerNum == 1) {
                word = "bottle"
            }
            println(beerNum + " " + word + " of beer on the wall")

            println(beerNum + " " + word + " of beer.")
            println("Take one down.")
            println("Pass it around.")
            beerNum = beerNum - 1

            if (beerNum > 0) {
                println(beerNum + " " + word + " of beer on the wall.")
            } else {
                println("I'm drunk as fuck.")
            }
        }
    }
}

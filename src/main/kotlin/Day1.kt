import java.io.File

class Day1 {
    fun main() {
        val input = File("src/main/kotlin/input/day1.txt").readText()
        val split = input.split("\n")
        var i = 0
        var sum = 0
        val largest = emptyList<Int>().toMutableList()
        while (i < split.size) {
            if (split[i] != "") {
                sum += split[i].toInt()
            } else {
                largest += sum
                sum = 0
            }
            i++
        }
        println("The elf carrying the most calories has ${largest.sortedDescending()[0]} calories")
        println("The elf carrying the second most calories has ${largest.sortedDescending()[1]} calories")
        println("The elf carrying the third most calories has ${largest.sortedDescending()[2]} calories")
        println("These elves are carrying a total of ${largest.sortedDescending()[0] + largest.sortedDescending()[1] + largest.sortedDescending()[2]}")
    }
}
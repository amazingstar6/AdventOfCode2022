import java.io.File

class Day4: Day {
    override fun part1() {
        var count = 0
        File("src/main/kotlin/input/day4.txt").forEachLine {
            val part1 = it.substringBefore(',')
            val part2 = it.substringAfter(',')
            val part1Letter1 = part1.substringBefore('-').toInt()
            val part1Letter2 = part1.substringAfter('-').toInt()
            val part2Letter1 = part2.substringBefore('-').toInt()
            val part2Letter2 = part2.substringAfter('-').toInt()
            if ((part1Letter1 <= part2Letter1 && part1Letter2 >= part2Letter2) || (part2Letter1 <= part1Letter1 && part2Letter2 >= part1Letter2)){
                count++
            }
        }
        println(count)
    }

    override fun part2() {
        var count = 0
        File("src/main/kotlin/input/day4.txt").forEachLine {
            val part1 = it.substringBefore(',')
            val part2 = it.substringAfter(',')
            val part1Letter1 = part1.substringBefore('-').toInt()
            val part1Letter2 = part1.substringAfter('-').toInt()
            val part2Letter1 = part2.substringBefore('-').toInt()
            val part2Letter2 = part2.substringAfter('-').toInt()
            for (i in part1Letter1..part1Letter2) {
                if (i in part2Letter1..part2Letter2) {
                    count++
                    println(it)
                    break
                }
            }
        }
        println(count)
    }
}
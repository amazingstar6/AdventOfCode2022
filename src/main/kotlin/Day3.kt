import java.io.File

class Day3: Day {
    override fun part1() {
        val result = emptyList<Char>().toMutableList()
        File("src/main/kotlin/input/day3.txt").forEachLine {
            val split1 = it.substring(0, (it.length/2))
            val split2 = it.substring(it.length/2, it.length)
            var tempResult = ' '
            var count = 0
            for (i in split1) {
                if (split2.contains(i)) {
                    if (i != tempResult) {
                        result += i
                        tempResult = i
                    }
                    count++
                }
            }
        }
        println(result.distinct())
        val map = mutableMapOf<Char, Int?>()
        var number = 1
        for (i in 'a'..'z') {
            map += i to number
            number++
        }
        for (j in 'A' .. 'Z') {
            map += j to number
            number++
        }
        var new: Int?
        var sum = 0
        for (i in result) {
            new = map.getValue(i)
            val notNullNew: Int = new!!
            sum += notNullNew
        }
        println(sum)
    }

    override fun part2() {
        val result = emptyList<Char>().toMutableList()
        val input = File("src/main/kotlin/input/day3.txt").readLines()
        var i = 0
        while (i < input.size - 2) {
            val line1 = input[i]
            val line2 = input[i + 1]
            val line3 = input[i + 2]
            var tempResult = ' '
            for (i in line1) {
                if (line2.contains(i) && line3.contains(i)) {
                    if (i != tempResult) {
                        result += i
                        tempResult = i
                    }
                }
            }
            i += 3
        }
        val map = mutableMapOf<Char, Int?>()
        var number = 1
        for (i in 'a'..'z') {
            map += i to number
            number++
        }
        for (j in 'A' .. 'Z') {
            map += j to number
            number++
        }
        var new: Int?
        var sum = 0
        for (i in result) {
            new = map.getValue(i)
            val notNullNew: Int = new!!
            sum += notNullNew
        }
        println(sum)
    }
}
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
        TODO("Not yet implemented")
    }
}
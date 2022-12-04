import java.io.File

class Day4Oneliner {
    fun part1() {
        TODO("Not yet implemented")
    }

    fun part2(): Int {
        var count = 0; File("src/main/kotlin/input/day4.txt").forEachLine { for (i in it.substringBefore(',').substringBefore('-').toInt()..it.substringBefore(',').substringAfter('-')
                .toInt()) { if (i in it.substringAfter(',').substringBefore('-').toInt()..it.substringAfter(',')
                    .substringAfter('-')
                    .toInt()) { count++; break } } }; return count
    }
}
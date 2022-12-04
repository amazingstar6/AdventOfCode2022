import java.io.File

class Day2 {
    fun part1() {
        val input = File("src/main/kotlin/input/day2.txt").readText()
        val split = input.split(" ", "\n")
        var i = 0
        var scoreShape = 0
        var scoreOutcome = 0
        var result = 0
        while (i < (split.size - 1)) {
            when (split[i + 1]) {
                "X" -> scoreShape = 1
                "Y" -> scoreShape = 2
                "Z" -> scoreShape = 3
            }
            when (split [i]) {
                "A" -> {
                    when (split[i + 1]) {
                        "X" -> scoreOutcome = 3
                        "Y" -> scoreOutcome = 6
                        "Z" -> scoreOutcome = 0
                    }
                }
                "B" -> {
                    when (split[i + 1]) {
                        "X" -> scoreOutcome = 0
                        "Y" -> scoreOutcome = 3
                        "Z" -> scoreOutcome = 6
                    }
                }
                "C" -> {
                    when (split[i + 1]) {
                        "X" -> scoreOutcome = 6
                        "Y" -> scoreOutcome = 0
                        "Z" -> scoreOutcome = 3
                    }
                }
            }
            result += (scoreShape + scoreOutcome)
            i += 2
        }
        println("The total score would be $result")
    }
    fun part2() {
        val input = File("src/main/kotlin/input/day2.txt").readText()
        val split = input.split(" ", "\n")
        var i = 0
        var scoreShape = 0
        var scoreOutcome = 0
        var result = 0
        while (i < (split.size - 1)) {
            when (split[i + 1]) {
                "X" -> scoreOutcome = 0
                "Y" -> scoreOutcome = 3
                "Z" -> scoreOutcome = 6
            }
            when (split [i]) {
                "A" -> {
                    when (split[i + 1]) {
                        "X" -> scoreShape = 3
                        "Y" -> scoreShape = 1
                        "Z" -> scoreShape = 2
                    }
                }
                "B" -> {
                    when (split[i + 1]) {
                        "X" -> scoreShape = 1
                        "Y" -> scoreShape = 2
                        "Z" -> scoreShape = 3
                    }
                }
                "C" -> {
                    when (split[i + 1]) {
                        "X" -> scoreShape = 2
                        "Y" -> scoreShape = 3
                        "Z" -> scoreShape = 1
                    }
                }
            }
            result += (scoreShape + scoreOutcome)
            i += 2
        }
        println("The total score would be $result")
    }
}
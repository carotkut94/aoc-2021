fun main() {
    fun part1(input: List<String>): Int {
        var increasingCount = 0
        input.reduce { prev, curr ->  if (curr.toInt() > prev.toInt()) increasingCount++; curr }
        return increasingCount
    }

    fun part2(input: List<String>): Int {
        val windowsSum = input.windowed(size = 3, step = 1).map{
            it.map{it.toInt()}.toList().sum().toString()
        }
        return part1(windowsSum)
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test")
    check(part1(testInput) == 7)
    check(part2(testInput) == 5)

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}


//ownerproof-3148193-1694411180-9e5008a8d340
fun main() {
    fun part1(input: List<String>): Int {
        var solution: Int = 0
        for( index in 1 until input.size){
            if(input[index] > input[index-1]){
                solution+=1
            }
        }
        return solution
    }

    fun part2(input: List<String>): Int {
        return input.size
    }

    // test if implementation meets criteria from the description, like:
//    val testInput = readInput("C:\\Users\\anshu\\IdeaProjects\\advent-of-code2021\\adventofcode.com_2021_day_1_input.txt")
//    check(part1(testInput) == 1)

    val input = readInput("C:\\Users\\anshu\\IdeaProjects\\advent-of-code2021\\adventofcode.com_2021_day_1_input.txt")
    part1(input).println()
//    part2(input).println()
}

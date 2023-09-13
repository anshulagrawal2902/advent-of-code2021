
fun getPosition(input: List<String>): Int{
    var aim=0
    var horizontal=0
    var depth=0
    for (index in input.indices ){
        var strArr = input[index].split(" ")
        when(strArr[0]){
            "forward"-> {
                horizontal+=strArr[1].toInt()
                depth+=aim*strArr[1].toInt()
            }
            "up"-> aim-=strArr[1].toInt()
            "down"->aim+=strArr[1].toInt()
        }
    }
    return horizontal*depth
}

fun main(){
    val input = readInput("C:\\Users\\anshu\\IdeaProjects\\advent-of-code2021\\adventofcode.com_2021_day_2_input.txt")
    print(getPosition(input))
}
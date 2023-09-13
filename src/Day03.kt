
import kotlin.text.*

fun part1(list: List<String>): Int{
    var length = list[0].length
    val arr = IntArray(length) {0}
    for(item in list){

        for(i in item.indices){

            if(item[i] == '0') arr[i]-=1
            if(item[i] == '1') arr[i]+=1
        }
    }
    var gamma = "0".repeat(length).toCharArray()
    var epsilon = "0".repeat(length).toCharArray()
    for(index in arr.indices){
        if(arr[index] < 0) {
            gamma[index] = '0'
            epsilon[index] = '1'
        }
        else {
            gamma[index] = '1'
            epsilon[index] = '0'
        }
    }
    return String(gamma).toInt(2)*String(epsilon).toInt(2)
}

fun part2(list: List<String>): Int{

    var length = list[0].length
    val arr = IntArray(length) {0}
    for(item in list){
        for(i in item.indices){
            if(item[i] == '0') arr[i]-=1
            if(item[i] == '1') arr[i]+=1
        }
    }
    for(index in arr.indices){
        if(arr[index] < 0) {arr[index] = 0}
        else if(arr[index] > 0) {arr[index] = 1}
        else {arr[index] = -1}
    }
    var oxygen:String
    var carbon:String
    var l = ArrayList<String>(list)
    print(l)
    print(arr.asList())
    var index=0
    while(l.size > 1){
        l = l.filter { it-> ((arr[index]==-1 && it[index].digitToInt() == 1) || it[index].digitToInt() == arr[index]) } as ArrayList<String>
        println(l.size)
        index++
    }
    oxygen = l[0]
    l = ArrayList<String>(list)
    index=0
    while(l.size != 1){
        l = l.filter{ it-> (arr[index]==-1 && it[index].digitToInt() == 0) || it[index].digitToInt() != arr[index] }  as ArrayList<String>
        println(l.size)
        index++
    }
    carbon=l[0]
    return oxygen.toInt(2)*carbon.toInt(2)
}


fun main(){
    val input = readInput("C:\\Users\\anshu\\IdeaProjects\\advent-of-code2021\\adventofcode.com_2021_day_3_input.txt")
    print(part2(input))
}
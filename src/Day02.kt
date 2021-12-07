import java.io.File

fun main(){

    var horizontal = 0
    var depth = 0
    File("src/Day02.txt")
        .readLines()
        .map { it.split(" ") }
        .map {
            val count = it[1].toInt()
            when(it[0]) {
                "forward" -> horizontal+=count
                "up" -> depth-=count
                else -> depth+=count
            }
        }

    println(horizontal*depth)
}
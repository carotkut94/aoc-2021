import java.io.File

fun main(){

    val moves = File("src/Day02.txt")
        .readLines()
        .map { it.split(" ") }
        .map {
            val count = it[1].toInt()
            when(it[0]) {
                "forward" -> Pair(+count, 0)
                "up" -> Pair(0, -count)
                else -> Pair(0, +count)
            }
        }

    val (horizontal, depth) = moves.reduce { (h,d), (x,y) -> Pair(h+x, d+y) }

    println(horizontal*depth)

    // Part 2, with aim inclusion

    val (horizontal1, depth1) = moves.fold(
        initial = Triple(0,0,0),
        operation = {(h,d,a),(x,y)->Triple(h+x,d+a*x, a+y)}
    )

    println(horizontal1*depth1)
}
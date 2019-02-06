import java.util.*

fun main(args: Array<String>) {
    dayOfWeek()
    timeOfDay()
}

fun dayOfWeek() {
    println("What day is it today?")
    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    println( when (day) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "Time has stopped"
    })
}

fun timeOfDay(){
    val time = Calendar.getInstance().get(Calendar.HOUR_OF_DAY)
    println( when (time){
        in 0..12 -> "Good Morning! Kotlin"
        else -> "Good Night, Kotlin"
    })
    println(time)
}

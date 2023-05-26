import kotlin.math.min

fun agoToText(time: Int) = when {
    (time <= 60) -> "был(а) только что"
    (time >= 61 && time <= 60*60) -> minutes(time)
    (time >= 60*60 + 1 && time <= 24 * 60 * 60) -> hour(time)
    (time >= 24 * 60 * 60 + 1 && time <= 2 * 24 * 60 * 60) -> "вчера"
    (time >= 2 * 24 * 60 * 60 + 1 && time <= 3 * 24 * 60 * 60) -> "позавчера"
        else -> "был(а) давно"
    }



fun minutes(time:Int): String{
    val minutes = (time/60).toInt()
    return when (minutes % 10) {
        1 -> if (minutes % 100 != 11) ("$minutes минуту назад") else ("$minutes минут назад")
        2, 3, 4 -> if (minutes > 20) ("$minutes минуты назад") else ("$minutes минут назад")
        else -> ("$minutes минут назад")
    }


}

fun hour(time:Int): String {
    val hour = (time/60).toInt()
    return when (hour % 10){
        1 -> if (hour % 100 != 11) ("$hour час назад") else ("$hour часов назад")
        2,3,4 -> if (hour > 20) ("$hour часа назад") else ("$hour часов назад")
        else -> ("$hour часов назад")
    }

}
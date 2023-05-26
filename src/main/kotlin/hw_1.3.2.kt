import java.util.Collections.max
import kotlin.math.max

fun fee(paymentMethod: String, valueTransfer: Int, valueMonthTransfer:Int) = when (paymentMethod){
    "VK Pay" -> if (valueTransfer <= 15_000 && valueMonthTransfer <= 40_000) 0 else -2
    "Visa", "Мир" -> if (valueTransfer <= 150_000 && valueMonthTransfer <= 600_000) max (35, (valueTransfer * 0.0075).toInt()) else -2
    "Mastercard", "Maestro" -> if (valueTransfer <= 150_000 && valueMonthTransfer <= 600_000) {
                                    if (valueTransfer + valueMonthTransfer < 75_000) 0 else (valueTransfer * 0.006 + 20).toInt()
                                } else -2
    else -> -1
    }


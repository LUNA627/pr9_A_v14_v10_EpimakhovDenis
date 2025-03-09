import java.time.DayOfWeek
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

// Базовый класс для представления телефонного звонка
open class PhoneCall(
    var phoneNumber: String, // Номер телефона
    val callDate: String, // Дата разговора (в формате "дд.мм.гггг")
    val duration: Int, // Продолжительность звонка в минутах
    val cityCode: Int, // Код города
    val callPricePerMinute: Double // Цена разговора в минуту
){

    // Функция для вывода информации о звонке
    fun PhoneCallInfo() {
        println("Номер телефона: $phoneNumber ")
        println("Дата разговора: $callDate")
        println("Продолжительность: $duration минут")
        println("Продолжительность в часах и минутах: ${FormatDuration(duration)}")
        println("Код города: $cityCode")
        IsLuckyCityCode()
        println("Цена разговора в минуту: $callPricePerMinute")
        println("$duration мин стоило: ${CalculateCallCost()} руб")
        println("Звонок состоялся в: ${ GetDayOfWeek()}")
    }

    // Функция для расчета стоимости звонка
    fun CalculateCallCost(): Double {
        return callPricePerMinute * duration
    }

    // Функция для определения дня недели звонка
    fun GetDayOfWeek(): String {
        val formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy")
        val date = LocalDate.parse(callDate, formatter)
        return when (date.dayOfWeek) {
            DayOfWeek.MONDAY -> "Понедельник"
            DayOfWeek.TUESDAY -> "Вторник"
            DayOfWeek.WEDNESDAY -> "Среда"
            DayOfWeek.THURSDAY -> "Четверг"
            DayOfWeek.FRIDAY -> "Пятница"
            DayOfWeek.SATURDAY -> "Суббота"
            DayOfWeek.SUNDAY -> "Воскресенье"
            else -> "Неизвестный день"
        }
    }

    // Функция для проверки, является ли код города "счастливым"
    fun IsLuckyCityCode() {
        val luckyNums = cityCode.toString()
        if (luckyNums.length != 3) {
            println("Введите пожалуйста 3 числа для кода города")
        } else {
            if (luckyNums[0] == luckyNums[1] && luckyNums[1] == luckyNums[2]) {
                println("ПОЗДРАВЛЯЕМ у вас счастливый код города")
            } else {
                println("У вас обычный код города")
            }
        }

    }

        // Функция для преобразования продолжительности в формат "часы:минуты"
         fun FormatDuration(duration: Int): String {
            val hours = duration / 60
            val minutes = duration % 60
            return String.format("%02d:%02d", hours, minutes)
        }






}
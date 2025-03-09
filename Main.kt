fun main() {
    try {

        // Запрашиваем данные у пользователя
        println("Введите данные о звонке:")
        println("Номер телефона:")
        val phoneNumber = readln()
        println("Дата разговора (в формате дд.мм.гггг):")
        val callDate = readln()
        println("Продолжительность звонка (в минутах):")
        val duration = readln().toInt()
        println("Код города:")
        val cityCode = readln().toInt()
        println("Цена разговора за минуту (руб):")
        val callPricePerMinute = readln().toDouble()


        // Создаем объект PhoneCall
        val call = PhoneCall(phoneNumber, callDate, duration, cityCode, callPricePerMinute)

        // Выводим информацию о звонке
        call.PhoneCallInfo()


        println("\n---\n")

        // Запрашиваем коэффициент роуминга
        println("Коэффициент роуминга (например, 1.5 для увеличения стоимости на 50%):")
        val roamingCoefficient = readln().toDouble()

        // Создаем объект RoamingCall
        val roamingCall = RoamingCall(phoneNumber, callDate, duration, cityCode, callPricePerMinute, roamingCoefficient)

        // Выводим информацию о звонке с роумингом
        roamingCall.PhoneCallInfoRoaming()

        // Выводим стоимость звонка с учетом роуминга
        println("Цена звонка с учетом роуминга: ${roamingCall.CalculateCallCostRoaming()} руб")
    }
    catch (e:Exception) {
        println("Неверный формат данных")
    }
}
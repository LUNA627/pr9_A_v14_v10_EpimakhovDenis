// Дочерний класс для представления звонка в роуминге
class RoamingCall(
    phoneNumber: String,
    callDate: String,
    duration: Int,
    cityCode: Int,
    callPricePerMinute: Double,
    val roamingCoefficient: Double // Коэффициент увеличения стоимости в роуминге
): PhoneCall(phoneNumber, callDate, duration, cityCode, callPricePerMinute) {


    // Функция для расчета стоимости звонка с учетом роуминга
    fun CalculateCallCostRoaming():Double {
        val costRoaming = CalculateCallCost()
        return if (duration > 10) {
            costRoaming * roamingCoefficient
        }
        else {
            return costRoaming
        }
    }

    // Функция для вывода информации о звонке с учетом роуминга
    fun PhoneCallInfoRoaming() {
        PhoneCallInfo()
        println("Режим: Роуминг")
        println("Коэффициент роуминга: $roamingCoefficient")
    }



}
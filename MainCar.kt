fun main() {
    try {
        // Ввод данных для Car
        println("Введите: Марку, мощность (л.с), цену (руб), выбор топлива(бензин - true или электричество - false), пробег")
        val car = Car(readln(), readln().toDouble(), readln().toDouble(), readln().toBoolean(), readln().toInt())
        car.InfoCar()


        println("\n---\n")

        // Ввод данных для Track
        println("Введите: Марку, мощность (л.с), цену (руб), грузоподъёмность (тонн), выбор топлива (бензин - true или электричество - false), пробег")
        val track = Track(
            readln(), // Марка
            readln().toDouble(), // Мощность
            readln().toDouble(), // Цена
            readln().toDouble(), // Грузоподъемность
            readln().toBoolean(), // Тип топлива
            readln().toInt() // Пробег
        )
        // Вывод информации об автомобиле
        track.InfoTrack()

        // Проверка необходимости ТО
        track.CheckMaintenance()

        // Дополнительные данные для расчета расхода топлива
        println("\nВведите пройденное расстояние (км) и израсходованное топливо (л) для расчета расхода:")
        val distance = readln().toDouble()
        val fuelUsed = readln().toDouble()
        track.CalculateFuelConsumption(distance, fuelUsed) // Расчет и вывод расхода топлива


    }
    catch (e:Exception) {
        println("Неверный формат данных")
    }
}
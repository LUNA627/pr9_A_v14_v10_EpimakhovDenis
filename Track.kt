// Дочерний класс Track - грузовик
class Track(brand:String, power:Double, price:Double, var liftingCapacity:Double, petrol:Boolean, probeg:Int): Car(brand, power, price,petrol,probeg) {


    // Функция для вывода информации о грузовике
    fun InfoTrack() {
        println("Марка: $brand")
        println("\n")
        println("Мощность: $power")
        PowerTrack()
        println("\n")
        println("Цена: $price")
        println("\n")
        println("Грузоподъемность: $liftingCapacity тонн")
        LiftingCapacityTrack()
        println("\n")
        ToplivoTrack()
    }

    // Функция для классификации грузовика по грузоподъемности
    fun LiftingCapacityTrack() {
        when (liftingCapacity) {
            in 0.5..2.0 -> println("Грузовик малой грузоподъёмности")
            in 2.0..5.0 -> println("Грузовик средней грузоподъёмности ")
            in 5.0..16.0 -> println("Грузовик большой грузоподъёмности")
            in 16.0..50.0 -> println("Грузовик особо большой грузоподъёмности")
            else -> println("Неверный ввод грузоподъемности")
        }
    }

    // Функция для вывода типа топлива
    fun ToplivoTrack() {
        if (petrol) {
            println("Машина на бензине")
        }
        else {
            println("Машина на электричестве")
        }
    }



    // Функция для расчета расхода топлива
    fun CalculateFuelConsumption(distance: Double, fuelUsed: Double) {
        val fuelConsumption = (fuelUsed / distance) * 100
        println("Средний расход топлива: ${"%.2f".format(fuelConsumption)} л/100 км")
    }

    // Функция для проверки необходимости технического обслуживания (ТО)
    fun CheckMaintenance() {
        when (probeg) {
            in 0..55000 -> println("Техническое обслуживание не требуется")
            in 55000..85000 -> println("Рекомендуется провести ТО: замена масла и фильтров")
            in 85000..300000 -> println("Необходимо ТО: проверка тормозной системы, подвески и двигателя")
            else -> println("Срочно требуется ТО: возможен износ критических узлов")
        }
    }

    // Функция для классификации грузовика по мощности
    fun PowerTrack() {
        when(power) {
            in 1.0..150.0 -> println("Маломощный грузовик")
            in 150.0..300.0 -> println("Грузовик средней мощности")
            in 300.0..500.0 -> println("Мощный грузовик")
            in 500.0..700.0 -> println("Очень мощный грузовик")
            in 700.0..900.0 -> println("Специальный грузовик ")
            else -> println("Неверный ввод мощности")
        }
    }




}
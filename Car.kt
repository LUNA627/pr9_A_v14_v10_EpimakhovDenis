open class Car (var brand:String,var power:Double, var price:Double, var petrol:Boolean) {



    fun InfoCar() {
        println("Марка: $brand")
        println("\n")
        println("Мощность: $power")
        Power()
        println("\n")
        println("Цена: $price")
        Price()
        println("\n")
        Toplivo()
    }


    fun Power() {
        when(this.power) {
            in 1.0..150.0 -> println("Легковой автомобиль")
            in 150.0..300.0 -> println("Среднетоннажный грузовик")
            in 300.0..500.0 -> println("Тяжелый грузовик")
            in 500.0..650.0 -> println("Грузовик с тяжелой грузоподъемностью")
            else -> println("Неверный ввод мощности")
        }
    }

    fun Price() {
        when(this.price) {
            in 75000.0..350000.0 -> println("Малобюджетный автомобиль")
            in 350000.0..950000.0 -> println("Средний сегмант автомобиля")
            in 950000.0..3000000.0 -> println("Дорогой автомобиль")
            in 3000000.0..100000000.0 -> println("Очень дорогой автомобиль")
            else -> println("Неверный ввод стоимости")
        }
    }


    fun Toplivo() {
        if (this.petrol) {
            println("Машина на бензине")
        }
        else {
            println("Машина на электричестве")
        }
    }
}
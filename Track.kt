class Track(brand:String, power:Double, price:Double, var liftingCapacity:Double, petrol:Boolean): Car(brand, power, price, petrol) {

    fun InfoTrack() {
        println("Марка: $brand")
        println("Мощность: $power")
        println("Цена: $price")
        println("Цена: $price")
        liftingCapacityTrack()
    }


    fun liftingCapacityTrack() {
        when (this.liftingCapacity) {
            in 0.5..2.0 -> println("Грузовик малой грузоподъёмности")
            in 2.0..5.0 -> println("Грузовик средней грузоподъёмности ")
            in 5.0..16.0 -> println("Грузовик большой грузоподъёмности")
            in 16.0..50.0 -> println("Грузовик особо большой грузоподъёмности")
            else -> println("Неверный ввод грузоподъемности")
        }

    }
}
fun main() {
    println("Введите: Марку, мощность, цену, и выбор топлива(true или false)")
    val p = Car(readln(), readln().toDouble(), readln().toDouble(), readln().toBoolean())
    p.InfoCar()

}
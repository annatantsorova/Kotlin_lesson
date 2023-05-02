// Practice 3 - date types
fun main() {
    val firstName: String = ("Анна")
    val lastName: String = ("Танцорова")
    var height: Double = 161.0
    val weight: Float = 66f
    val isChild: Boolean = height < 150 || weight < 40f
    println(isChild)
    var isAdult : String
    if (isChild) {
        isAdult = "РЕБЕНОК"
    }else{
        isAdult = "ВЗРОСЛЫЙ"
    }
    var info = "Меня зовут $firstName $lastName. Мой рост составляет $height см, а вес $weight кг. Я являюсь $isAdult "
        println(info)

    height = 145.0
    val isChildNew = height < 150 || weight <40f
    var isAdultNewArrayTree : String
    if (isChildNew) {
        isAdultNewArrayTree = "РЕБЕНОК"
    }else{
        isAdultNewArrayTree = "ВЗРОСЛЫЙ"
    }
    val infoNew = "Меня зовут $firstName $lastName. Мой рост составляет $height см, а вес $weight кг. Я являюсь $isAdultNewArrayTree "
    println(infoNew)
}
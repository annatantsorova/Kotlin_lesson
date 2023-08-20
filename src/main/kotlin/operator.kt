//Разработайте цикл и напишите программу, которая вычисляет n-е число из ряда Фибоначчи.
//
//Число n должно вводиться с клавиатуры. Вводимые символы должны проверяться на соответствие условию n > 0.
// В случае невыполнения условия программа должна указывать на ошибку ввода и предлагать ввести число до тех пор, пока не будет введено корректное значение.
//Вычислите нужный член последовательности с помощью формулы F(n) = F(n-1) + F(n-2) и цикла.
//Выведите рассчитанное значение в консоль. Убедитесь, что число рассчитано верно, проверив его по таблице чисел Фибоначчи. Поэкспериментируйте с разными n.

fun main() {
    val n = getValidInput()
    val fibNumber = fibonacci(n)
    println("Число Фибоначчи F($n) = $fibNumber")
}
fun getValidInput(): Int {
    while (true) {
        try {
            print("Введите число ")
            val n = readLine()?.toIntOrNull()
            if (n != null && n > 0) {
                return n
            } else {
                println("Ошибка ввода. Число должно быть больше 0.")
            }
        } catch (e: NumberFormatException) {
            println("Ошбка ввода. Введите целое число.")
        }
    }
}

    fun fibonacci(n: Int): Int {
        if (n == 1 || n == 2 ) {
            return 1
        }
        var fibPrev = 1
        var fibCurr = 1
        for (i in 3..n) {
            val fibNext = fibPrev + fibCurr
            fibPrev = fibCurr
            fibCurr = fibNext
        }
        return fibCurr
    }






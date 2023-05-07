//Разработайте цикл и напишите программу, которая вычисляет n-е число из ряда Фибоначчи.
//
//Число n должно вводиться с клавиатуры. Вводимые символы должны проверяться на соответствие условию n > 0.
// В случае невыполнения условия программа должна указывать на ошибку ввода и предлагать ввести число до тех пор, пока не будет введено корректное значение.
//Вычислите нужный член последовательности с помощью формулы F(n) = F(n-1) + F(n-2) и цикла.
//Выведите рассчитанное значение в консоль. Убедитесь, что число рассчитано верно, проверив его по таблице чисел Фибоначчи. Поэкспериментируйте с разными n.


fun main() {
    var n : Int =  -10000000;
    while (n < 0 ) {
        print("Введите число : ")
        n = readLine()?.toIntOrNull() ?: return
        if (n < 0) {
            println("Ошибка: число должно быть больше нуля.")
        }
    }

    var n0 = 0L
    var n1 = 1L
    for (i in 2 until n) {
        val n2 = n0 + n1
        n0 = n1
        n1 = n2
    }
    println("Вычисленное число из ряда Фибоначчи: $n1")
}
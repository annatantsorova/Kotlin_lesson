fun main() {
    val message = "F2p)vy233{0->c}ttelciFc"
    val messageLength = message.length
    val halfLength = messageLength / 2
    var firstHalf = message.substring(0, halfLength)
    firstHalf = firstHalf.replace('0', 'o')
    firstHalf = shiftCharacters(firstHalf, 3)
    firstHalf = firstHalf.replace('4', 'u')
    firstHalf = firstHalf.replace('5', 's')
    firstHalf = shiftCharacters(firstHalf, -1)

    var secondHalf = message.substring(halfLength, messageLength)
    secondHalf = secondHalf.replace(' ', '_')
    secondHalf = shiftCharacters(secondHalf, 4)
    secondHalf = secondHalf.reversed()

    val decryptedMessage = firstHalf + secondHalf
    println("Расшивровка: $decryptedMessage")
}

fun shiftCharacters(str: String, shift: Int): String {
    val shiftedChars = CharArray(str.length)
    for (i in str.indices) {
        shiftedChars[i] = str[(i + shift + str.length) % str.length]
    }
    return String(shiftedChars)
}



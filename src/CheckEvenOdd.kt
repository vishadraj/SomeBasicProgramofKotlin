fun main(){

    print("Enter a number : ")

    val num = readLine()!!.toInt()

    val evenOdd = if (num % 2 == 0 ) "Even" else "Odd"

    println("$num is $evenOdd")

}
import kotlin.math.max

fun main(){
    println("Pets App")
    print("Enter number of pets: ")
    val maxSize = readLine()!!.toInt()
    // write App in Array
    var listOfPets:Array<String> = Array(maxSize){""}
    for(i in 0 until maxSize) {
        print("Enter Pet name $i: ")
        listOfPets[i] = readLine()!!.toString()
    }
    println("Your pets are using array ")
    for(i in 0 until maxSize){
        println(" Pet $i:   ${listOfPets[i]}")
    }

}
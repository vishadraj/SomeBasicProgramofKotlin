fun main(){
    print("Pick food menu : ")
    val foodID = readLine()!!.toInt()
    when(foodID){
        1 -> {
            println("You got Sandwich")
            print("You got salad")
        }
        10 -> {
            println("you got burger")
        }
        else -> {
            println("you did not order anything")
        }

    }
}
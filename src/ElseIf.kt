fun main (){
    print("Enter you age : ")
    val age = readLine()!!.toInt()
    if (age >= 18){
        println("you could apply for the job")
    }else{
        println("you can not apply for the job ")
    }
}
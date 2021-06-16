fun main() {
    var name = " Vishad "
    val age = 30
    val GPA = 3.8
    name = "raj"
    var lastname = " Vashishtha "
    println("<------ User info -----> ")
    println("Name -- $name")
    println("Age -- $age")
    println("GPA  -- $GPA")
    println("last Name -- $lastname ")

    var count = 1
    println("Count : $count")
    count = 10
    println("Count : $count")

    var department:String?
    department = null
    department = "Software Engineering "
    print("Department ${department!!}")


}
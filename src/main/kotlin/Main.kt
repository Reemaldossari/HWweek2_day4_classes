fun main() {

    println(" Welcome to the college")
    println("Enter student first name , last name and course name")
    val st1 = Professor.Student(readLine()!!.toString())

    println(" Welcome to the college")
    println("please enter first and last name of professor:")

    var pro1 = Professor(readLine()!!.toString())


    println("Enter name of  the course")
    var course1 = Course(readLine()!!.toString())

}

class Course(toString: String) {

    var CourseName: String = "Math"
    var Number_of_luctures: Int = 0
    var professor: String = "Saleh"
    var student: String = "Amjad"
    var Class: Boolean = true

    fun numberOfStudent(): Int {
        return Number_of_luctures


    }


    fun assignProfessor(p: Professor): Boolean {
        return Class


    }
}

fun professorName(): String {

    return professorName()
}


class Professor(
    var firstName: String = "Ahmed",
    var lastName: String = "Saad",
    var telephone: Int = 12345,
    var courses: String = "English"
) {


    constructor (firstName: String, lastName: String, telephone: Int) : this() {

        this.firstName = firstName
        this.lastName = lastName
        this.telephone = telephone
    }

    fun fullName(): String {
        return (" $firstName $lastName ")
    }

    class Student(var firstName: String = "Mohammed", var lastName: String = "Ali", var courses: String = "") {


        fun fullName(): String {
            return (" $firstName $lastName")
        }
    }
}






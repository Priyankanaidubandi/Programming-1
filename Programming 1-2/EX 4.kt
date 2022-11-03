
fun main() {
    var courseRating = CourseRating()
    courseRating.apply{
        className = "Maths class"
        instructorName = "David"
        classRating = "5.0"
        classFees = "500"
    }
   
    
    
    println("Class Name :- " + courseRating.className)
    println("Instructor Name :- " + courseRating.instructorName)
    println("Class Rating :- " + courseRating.classRating)
    println("Class Fees :- " + courseRating.classFees)

}


class CourseRating{
    var className = ""
    var instructorName = ""
    var classRating = ""
    var classFees = ""
}
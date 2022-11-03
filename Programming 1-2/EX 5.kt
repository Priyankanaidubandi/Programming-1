fun main() {
    val courseRatingFirst = CourseRating()
    courseRatingFirst.apply{
        className = "Maths class"
        instructorName = "David"
        classRating = "5.0"
        classFees = "500"
    }
    
    val courseRatingSec = CourseRating()
    courseRatingSec.apply{
        className = "English class"
        instructorName = "Jack"
        classRating = "6.0"
        classFees = "123"
    }
    
    
      val courseRatingThird = CourseRating()
    courseRatingThird.apply{
        className = "Science class"
        instructorName = "Rock"
        classRating = "1.0"
        classFees = "540"
    }
    
  
    val aa = arrayOf(courseRatingFirst,courseRatingSec,courseRatingThird)
    
    for(i in aa.indices){
    
    println("Class Name :- " + aa[i].className)
    println("Instructor Name :- " + aa[i].instructorName)
    println("Class Rating :- " + aa[i].classRating)
    println("Class Fees :- " + aa[i].classFees)    
    println("----------")
    }
    
   
    
    
    //println("Class Name :- " + courseRating.className)
   // println("Instructor Name :- " + courseRating.instructorName)
   // println("Class Rating :- " + courseRating.classRating)
    //println("Class Fees :- " + courseRating.classFees)

}


class CourseRating{
    var className = ""
    var instructorName = ""
    var classRating = ""
    var classFees = ""
}
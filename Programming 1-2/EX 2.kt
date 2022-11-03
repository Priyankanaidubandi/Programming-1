fun main() {
    val reader = Scanner(System.`in`)
    print("enter hour:")

    // using user input directly inside when block
    when(reader.nextInt()) {
        in 0..11 -> println("Good Morning!!")
        in 12..16 -> println("Good Afternoon!!")
        in 17..20 -> println("Good evening!!")
        in 21..23 -> println("Good Night!!")
        else -> println("Not a valid hour value")
    }
}
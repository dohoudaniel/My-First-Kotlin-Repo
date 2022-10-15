/*In this project, I hope to practice all I am learning from GADS, Andela Learning Community and the book
Atomic Kotlin, as I learn the basics and fundamentals of Kotlin. I really hope this works and goes well. I surely will
face problems along the way, It is worth it and I will never give up. -->> 25th September 2022*/

/**
 * main - Entry point of the Kotlin Program
 */
//I will be using the main() function to call all other functions

fun main() { //The function main() is the default entry point in Kotlin
    println("Hello World!")  //This prints Hello World
    println("A new Kotlin developer is born today! Today is 25th September 2022.")

    var question:String = "His name is Dohou Daniel."
    println(question)

    var status = """He is learning Android Application Development with Google Africa Developer Scholarship 2022
        |And that's not all, he is also learning Software Engineering with ALX Africa Software Engineering Cohort 9
    """.trimMargin()
    println(status)

/*
Calling all functions goes like this.
The output works according to the order in which you call them.
You call functions in the main function, because the main() function is the entry point of the Kotlin program
 */
    checkAgeAndName()   //This is how to call a function. You call a function by inputting the name of the
    workingWithIfElse() //function and putting () at the end of the function. E.g: myFunction()
    workingWithBooleansAndIfElse()
    //rechecking()
    //referToTrueOrFalse()
    firstStringTemplate()
    testString()
//return is always Unit by default
    return Unit

}

//Creating several Functions and using data types, and Booleans

//Using Strings
fun checkAgeAndName() {

    var tripleQuotedStrings: String = """Let us hear from him.
        |So, Dohou Daniel, how is programming with Kotlin and C going?
    """.trimMargin() //I pressed the "Enter button
    println(tripleQuotedStrings)
    println("Dohou Daniel: 'It is hard, to be honest, and confusing most times.")
    print("But the key is to control your emotions, keep practicing and keep building.\n")
}

//Using Int and Strings
fun workingWithIfElse() {
    var test:Int = 5
    if (test < 5) {
        println("""Your test score is less than 5. Try harder next time, but still well-done"""")
    }
    else if (test == 5)
            println("Practice really is the key to being a successful programmer, because practice makes it stick.")
    else
        println("Well-done! You were more than excellent!!")
}

//Booleans
fun workingWithBooleansAndIfElse() {

    val y: String = "Honestly, it is not easy starting out as a programmer."
    println(y)

    val d: Boolean = 20 >= 20
    if (d)
        println("But personally, I have no single excuse to fail, cause I have really been blessed by Jehovah.")
    print("He provides everything I need.\nThanks to Him\n")

    val testFalse: Boolean = false // Checking how 'false' works with Booleans
    if (!testFalse)
        println("I have a lot going on now. I is a part of life. So I will never give up.")

    //val toSee:Int = 99
    //val checking:Int = if (toSee == 100) 100 else 200
    println("I must complete the Project Phase of GADS where I am now, and I must finish the ALX SE Program")
}

//Using a Boolean by calling the variable or value directly by using if(var)
fun trueOrFalse(exp: Boolean): String {
    if (exp)
        return "It's true!" // [1]
    return "It's false" // [2]

}

//Checking to see if you can add numbers directly to a var in a function by directly adding numbers to it
fun rechecking() {
    var revising:Int = 15
    println(revising + 5)
}

//This works with the trueOrFalse function, because the trueOrFalse function is called in here
fun referToTrueOrFalse() {
    val b = 1

    println(trueOrFalse(b < 3)) //This refers to the trueOrFalse function. The trueOrFalse function is called here
    println(trueOrFalse(b >= 3)) //This refers to the trueOrFalse function. The trueOrFalse function is called here
}

//Using String Templates
fun firstStringTemplate() {
    val first:String = "And the truth is, Kotlin"
    println("$first is a simple programming language to learn")
    //println("\n") //This is the syntax to printing a new line
}

fun testString() {
    val second:String = "Kotlin is"
    val n = "Do you really believe that $second" // \n is a newline character
    val p = " a better Java?. It truly is easy to learn...\n" //Type Inference here automates n to being a string
    println(n)
    print(p)
    println("The bottom line is as long as I am alive, I am never giving up'")
    println("""Thank you Mr Dohou Daniel for having this session with us. We really hope to see you at the end of
        |the line. Keep learning, keep pushing and please, never give up!
        |Thanks so much Mr Dohou Daniel Favour Leonardo Ayobami Sonagnon Hyacinth
    """.trimMargin())
}

//TODO: Check out for how many variables and values can be in a function
//You use == to check for equality
//You use != to check for inequality
//The “not” operator ! tests for the opposite of a Boolean expression
/* Documentation works the same way it does too in C
   All you need to do is use the /** */
 */
// 'println("")' is also equal to 'print("\n")

/*PERSONAL ATTENDANCE
Began personal practice -> 25th September 2022
Ended personal practice by 9:40PM 25th September 2022
Back here again - 29th September 2022 5:45AM
Back again - 2nd October 2022 8:13PM
Ended practice and review - 2nd October 2022
Back here again - 14th October 2022
Signing out - 15th October 2022 1:40AM //Stopped at String Templates
 */


// Try adding program arguments via Run/Debug configuration.
// Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
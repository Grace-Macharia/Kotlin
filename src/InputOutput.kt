import java.util.Scanner
fun main(args: Array<String>) {
    print("Please enter your name:")
    var enteredString = readLine()
    println("You have entered the string $enteredString")

    print("Please enter a number:")
    var enteredNumber = Integer.valueOf(readLine())
    println("You have entered a number $enteredNumber")

    var read = Scanner(System.`in`)
    println("Please enter an integer")
    var enteredInteger = read.nextInt()
    println("The integer entered is $enteredInteger")

    println("Please enter an float")
    var enteredFloat = read.nextFloat()
    println("The integer entered is $enteredFloat")

    println("Enter your multiplication outcome: ")
    var enteredMultiplication = Integer.valueOf(readLine())
    println("The multiplication output is $enteredMultiplication")

}
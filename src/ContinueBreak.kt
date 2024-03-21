fun main(args: Array<String>) {
    //continue statement
    for (n in 1..5){
        println("before continue, loop $n")
        if (n == 2||n == 4)
            continue
        println("after continue, loop $n")
    }
    //break an algorithm
    for (m in 1..10){
        println("before break, loop $m")
        if (m == 5){
            println("Terminating the loop...")
            break
        }
    }
    for (char in 'a'..'z'){
        println("before break, loop $char")
        if (char == 'Q'){
            println("Terminating the loop...")
        }

    }






}
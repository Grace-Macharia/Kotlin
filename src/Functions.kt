fun main(args: Array<String>) {
println(birthdayGreeting("Andrew",18,"Beatrice"))
println(birthdayGreeting("James",45,"Rodger"))
println(birthdayGreeting("Agnes",12,"Eunice"))
println(welcome("Valary's"))
println(area(14,3.14))
println(BMI())
}
fun birthdayGreeting(name: String,age: Int, first:String): String{
    val m ="Happy birthday $name"
    val n ="You are $age years old"
    val o ="Regards from $first"
    return "$m\n$n\n$o"
}
fun welcome(name: String): String{
    val a = "$name invitation "
    val b = "to her birthday"
    val c = "Which is tomorrow"
    return "$a\b$b\b$c"
}
fun area(radius:Int,pi:Double = 3.14): String{
    val w = pi*radius*radius
    val g = "The circle's area is: "
    return ("$g$w")
}
fun BMI(height:Double = 1.7,weight:Double =54.3): String{
    val p = weight/(height*height)
    val z = "The BMI is:"
    return ("$z$p")

}
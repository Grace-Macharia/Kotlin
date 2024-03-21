fun main(args: Array<String>) {
    val child1 = Child()
    child1.myfunction()

    val dog1 = Dog("Black",10)
    dog1.bark()

    val cat1 = Cat("Ginger",5)
    cat1.meow()
}
open class Parent{
    val x= 5
}
class Child:Parent(){
    fun myfunction(){
        println(x)
    }
}
open class Animal(var color:String,var age:Int){
    init {
        println("The color is: $color")
        println("The age is: $age")
    }
}
class Dog(color: String,age: Int):Animal(color,age){
    fun bark(){
        println("A dog barks")
    }
}
class Cat(color: String,age: Int):Animal(color,age){
    fun meow(){
        println("A cat meows")
    }
}
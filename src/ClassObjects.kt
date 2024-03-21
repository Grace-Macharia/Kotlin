fun main(args: Array<String>) {
    val lamp1 = Lamp()
    lamp1.turnOff()
    println(lamp1.displayLampStatus("Flourescent"))

    val window1 = Window()
    window1.close()
    println(window1.displayWindowStatus("Louvres"))

}
class Lamp{
    var isOn:Boolean = false

    fun turnOff(){
        isOn = false
    }
     fun turnOn(){
         isOn = true
     }
    fun displayLampStatus(Lamp:String){
        if (isOn==true){
            println("$Lamp is on")
        }else{
            println("$Lamp is off")
        }

    }
}
class Window{
    var isOpen:Boolean = false

    fun close(){
        isOpen = false
    }
    fun open(){
        isOpen = true
    }
    fun displayWindowStatus(Window:String){
        if (isOpen==true){
            println("$Window is open")
        }else{
            println("$Window is closed")
        }

    }
}
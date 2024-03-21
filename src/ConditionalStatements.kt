fun main(args: Array<String>) {
    var num = 100
    if(num<0){
        println("This is a negative number")
    }else{
        println("This is a positive number")
    }
    var height = 17
    if(height<20){
        println("You are tall")
    }else{
        println("You are too tall")
    }
    var age = 30
    if(age<10){
        println("You are in a primary school")
    }
    else if(age>=10&&age<=14){
        println("You are in a junior school ")
    }
    else if(age<=18&&age>=15){
        println("You are in a senior secondary")
    }
    else if(age>=19&&age<=25){
        println("You are in campus")
    }else{
        println("You are an adult out of school")
    }
//WHEN STATEMENT
    var letter = 'o'
    when(letter){
        'a'-> println("a is a vowel")
        'e'-> println("e is a vowel")
        'i'-> println("i is a vowel")
        'o'-> println("o is a vowel")
        'u'-> println("u is a vowel")

        else -> println("$letter is a consonant")
    }
    var number = 0
    when(number){
        1-> println("Too bad, you failed the game")
        2-> println("Wow, you almost got the game")
        3-> println("Congratulations you are the winner")
        else-> println("$number is not valid. Try again")
    }

    var Height = 2500
    var Weight = 100
    var BMI_Calc = Height/Weight
    println(BMI_Calc)
    if(BMI_Calc<18){
        println("you are underweight")
    }
    else if(BMI_Calc>18&&BMI_Calc<=25){
        println("you are normal")
    }
    else if(BMI_Calc>25&&BMI_Calc<=30){
        println("you are overweight")
    }else{
        println("you are obese")
    }




}

fun main(args: Array<String>) {
    //data structure
    var arr = arrayOf(10,56.9,"farry","g")
    var arr1 = arrayOf<Int>(27,478,748,52)
    var arr2 = arrayOf<String>("joe","abby","gabu")

    //modifying a value within array
    var fruits = arrayOf("mangoes","apples","oranges")
    println(fruits[2])
    fruits[2] = "bananas"
    println(fruits[2])

    //modifying array using set function
    var names = arrayOf("Larry","Ruth","Rose","Lucy")
    names.set(2,"Ann")
    println(names[2])
    names.set(3,"Jeremy")
    println(names[3])

    //fetching a value using a get function
    var browsers = arrayOf("Firefox","Safari","Chrome","Brave","Edge")
    browsers[2]
    println(browsers[2])
    println(browsers.get(2))
    println(browsers.get(4))


}
fun main(args: Array<String>) {
    details("Lucky", 34, "Kenyan")
    addition(32, 40,65,21)
    average(listOf(59.25, 28.00, 25.90, 94.55, 45.90))
    records()

}
fun details(userName: String, age: Int, nationality: String){
    println("Hello, my name is $userName, I am $age and I am from $nationality")

}
//Create and invoke a function that returns the sum of any given 4 numbers (3 points)
fun addition(a: Int, b:Int, c: Int, d: Int): Int{
    var sum = (a + b + c + d)
    return sum

}
//Create and invoke a function that given any 5 numbers, it returns their average (2 points)
fun average(numbers: List<Double>): Double{
    var add = numbers.sum()
    return add / numbers.sum()

}
// You are creating an app to capture a person’s records. Some data you will
//capture includes full name, age, phone number, email, weight in kg, and citizen. For the
//citizen field, you will track whether a student is a Ugandan or not. (3 points)
fun records(){
    var fullName = "Lucky Wangari"
    println(fullName)
    var age = 45
    println(age)
    var phoneNumber = "0712345678"
    println(phoneNumber)
    var weight = 45.50
    println(weight)
    var isUgandan: Boolean = true
    println(isUgandan)
    var notUgandan: Boolean = false
    println(notUgandan)

}
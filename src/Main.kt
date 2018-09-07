fun main(args:Array<String>) {

    // defining variable for name age dep with null values
    val name:String?
    val age:Int
    val dep:String?

    println("Enter name:")
    name = readLine()!!

    println("Enter age:")
    // checking for null while coverting from string to Int

    age = readLine()!!.toInt()

    println("Enter dep: ")
    // accepting null values
    dep = readLine()!!

    print("$name is $age years old studying in $dep.");
}
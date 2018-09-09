fun main(args: Array<String>) {

    show(1)
    show("Emdad")
    show(2.0)

}


// function with same name and same number of params but different datatypes of param is called polymorphism
fun show(name:String):Unit{
    println(name)
}

fun show(number:Int):Unit{
    println(number)
}

fun show(numberD:Double):Unit{
    println(numberD)
}
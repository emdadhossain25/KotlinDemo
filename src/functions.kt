fun main(args: Array<String>) {
    println(sum(25.0,55.0))
    disply()
}

fun disply(n:Int=0):Unit{
    println("n:$n")
}

fun sum(n1:Double, n2:Double):Double{
    // block of code
    var sum = n1+n2
    return sum
}
fun main(args: Array<String>) {
    var n1 = 20
    var n2 = 20

    // entering if statement comparing the variables and taking the bigger number
    var max = if (n1>n2) n1 else n2;

    println("Max number is : $max")

    var age= 30

    var isYoung = when(age){
        30-> true
        else -> false
    }

    println("Is young : $isYoung")
}
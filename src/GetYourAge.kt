import java.util.*

fun main(args: Array<String>) {
    println("Enter your DOB")
    var DOB:Int = readLine()!!.toInt();
    var calendar:Int = Calendar.getInstance().get(Calendar.YEAR)
    var age : Int = calendar - DOB
    println("You are $age years old")
}
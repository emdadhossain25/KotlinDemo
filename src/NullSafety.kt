
// adding main function for null safety in print statement

fun main(args: Array<String>){

    // here we are saying this variable can be null -> unassigned value using ? sign
    var name:String?

//    name = null
    name = "hossain"

    // !! here this sign indicates null safety -> will throw KotlinNullPointerException
    println(name!!)
}
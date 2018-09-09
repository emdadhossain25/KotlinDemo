class Outer{

    var name:String = "test"

    inner class Nested{

        init {
            println(name)
        }
    }
}

fun main(args: Array<String>) {
    var outer = Outer();
//    println(outer.name)

    var nested = outer.Nested()
}
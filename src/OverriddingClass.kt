// here open means it is accessible not final
open class Operations1() {

    // by default public can be accessed from inheritance class also the public main method

    var processName: String? = null



    //    protected can be accessed only by inherited class not by main method
    //    protected var processName:String? = null


    //    private can be accessed only by class where it is defined
    //    private var processName:String? = null



    open fun sum(n1: Int, n2: Int): Int {
        return n1 + n2
    }

    fun div(n1: Int, n2: Int): Int {
        return n1 / n2
    }
}


class MultiOperations1() : Operations1() {



    override fun sum(n1: Int, n2: Int): Int {
        return n1 + n2*3
    }
    fun sub(n1: Int, n2: Int): Int {
        return n1 - n2
    }

    fun mul(n1: Int, n2: Int): Int {
        return n1 * n2
    }

}

fun main(args: Array<String>) {
    var op = Operations1()
    var sum = op.sum(10, 50)
    println(sum)
    var div = op.div(12, 11)
    println(div)
    var mulop = MultiOperations1()
    println(mulop.sum(2, 2))
}
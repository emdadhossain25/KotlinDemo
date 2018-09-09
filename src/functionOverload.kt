fun main(args: Array<String>) {
    println(sum(1,2,34,6))
    println(sum(1,2,6))
    println(sum(1,6))
}



// overlaoding with 2 params
fun sum(n1:Int, n2:Int):Int{
    return n1+n2;

}

// function overloading with 3 params

fun sum(n1:Int, n2:Int,n3:Int):Int{
    return n1+n2+n3;

}


// function overloading with 4 params

fun sum(n1:Int, n2:Int,n3:Int, n4:Int):Int{
    return n1+n2+n3+n4;

}



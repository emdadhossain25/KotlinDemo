fun main(args: Array<String>) {
    var x:Int = 10;
    var y:Int = 11;

    // here the decrement operator is in front of the variable hence will follow rules of executing just after bracket

    /**
     *()
     * ++x,--x before the variable
     * ^
     * /
     * *
     * +
     * -
     * =
     * x++, y++
     */
    var sum = --x+y

    // here x = 9 , y =11
    println(sum)
    println("value of before: $x")


    //here x = 9, y =11 x will decrease after assigning equal sign
    var afterSum = x--+y
    println(afterSum)
    println("value of after: $x")


}
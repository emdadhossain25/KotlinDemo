fun main(args: Array<String>) {

    var x: Int ?;
    x = 0
    //more then one block of code
    //more then one block of code
    when(x!!){

    // checking the value of x and printing the values like switch in java
        1,2->

            println("Value of x is $x")
        in 5..10->
            println("Value of x is $x")

        !in 5..10->
            println("not Value of x is $x")
        else ->{
            println("value of x is $x")
        }
    }


}
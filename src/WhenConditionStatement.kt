fun main(args: Array<String>) {

    var x: Int = 11;


    when(x){

        // checking the value of x and printing the values like switch in java
        1,2->

            println("Value of x is $x")
        in 5..10->
        {
            //more then one block of code
            println("Value of x is $x")
        }

        !in 5..10->
        {
            //more then one block of code
            println("not Value of x is $x")
        }
        else ->{
            println("value of x is $x")
        }
    }


}
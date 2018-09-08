fun main(args: Array<String>) {


    for (x in 1 ..3){
        if (x == 2)
        // here only the condition for x == 2 will go back to for loop withou executing the print
            continue

        println(x)
    }
    // here loop is the label which the break statement can reach from nested loops
    loop@for (count1 in 1 ..5){
        for (count2 in 1..7){
            if (count2 == 2){
                // here when the count2 variable in the nested loop equals 2 the outside for loop will break
                break@loop
            }
        }
    }


}
/**
 * search = o(n)
 * access = o(1)
 * insert = 0 (n);
 * delete = o(n)
 * Big O nothation
 *
 */

fun main(args: Array<String>) {

//    declaring an array on 5 elements and values of 0's in it

    var arrayInt = Array<Int>(5) { 0 }
    arrayInt[3] = 55
    println("Array[3] = " + arrayInt[3])

    println("All element")

    for (element in arrayInt)
        println(element)

    println("All element with index")
    for (index in 0..4)
        println(arrayInt[index])


    // array for string

    var arrayStr = Array<String>(4){""}

        for (index in 0 ..3){
            println("arrayStr[ $index] =")
            arrayStr[index] = readLine()!!
        }

        for (index in 0 ..3){
            println("arrayStr [$index] = "+arrayStr[index])
        }
}
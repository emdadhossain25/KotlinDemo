fun main(args: Array<String>) {
    // here all elements will be unique so 55 will be show only once
    var setent = setOf(1,2,3,4,55,55)

    // can not add for sets its immutable
    for (element in setent)
        println(element)


    var setentMutable = mutableSetOf(1,2,3,4,55,55)

    setentMutable.add(56)
    // can not add for sets its immutable
    for (element in setentMutable)
        println(element)
}
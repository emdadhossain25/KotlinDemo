fun main(args: Array<String>) {

    // hashmap of kotlin syntax
    var map  = hashMapOf(1 to "hussein", 2 to "jena")
    map.put(3,"java")

    println(map.get(3))
    println(map[2])

//declaring of array in kotlin syntax
    var ar = arrayOf(1,10,11,22)
    println(ar[0])


    // list here is linked list -> immutable
    var list = listOf(11,22,33,22)
    for (item in list)
            println(item)


    // list here is linked list -> mutable
    var mutablelist = mutableListOf(11,22,33,22)
    mutablelist[0]=10
    for (item in mutablelist)
            println(item)
}
fun main(args: Array<String>) {

    // saves the value in key value pair
    var map = HashMap<Int,String>()
    map.put(0,"emdad");
    map.put(1,"habib")
    map.put(2,"faiyaz")
    map.put(2,"sheikh faiyaz")

    for (index in map.keys)
    println("key: ${index} value : ${map.get(index)}")
}
class Generics <T>(price : T){
    init {
        println(price)
    }
}

fun main(args: Array<String>) {
    var generics = Generics<String>("Test")
}
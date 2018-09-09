fun main(args: Array<String>) {
    var title = " welcome to new york?"
    println(title);
    println("title: "+title)
    println("title : $title")
    println("Second Character : " +title[1])
    println("title : ${title.toUpperCase()}")
    println("split : ${title.split("t")}")
    println("trim : ${title.trim()}")
}
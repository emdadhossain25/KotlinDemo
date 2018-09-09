fun main(args: Array<String>) {
    // checking array list
    // wont have to define a size
    // you can add as much array element because its an linked list

    var arrayList = ArrayList<String>()
    arrayList.add("emdad")
    arrayList.add("hossain")
    arrayList.add("dev")


    println("First Name: ${arrayList.get(0)}")

    //updating using set method
    arrayList.set(0,"Emdad")

    println("all element")

    // getting the elements
        for (item in arrayList){
            println(item)
        }

    // getting using index values
//
    println("all element using index")
//
        for (index in 0 .. arrayList.size-1){
            println(arrayList.get(index))
        }

    if (arrayList.contains("Emdad")){
        println("Name is found")
    }
    else
        println("Name is not found")
}
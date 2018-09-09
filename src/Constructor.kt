



class Casr(){
    var type:String?=null
    var model:Int? = null
    var price:Double? = null
    var milesDrive:Int? = null
    var owner:String? =null

    // first constructor
    constructor(type:String,  model:Int,  price:Double,  milesDrive:Int,  owner:String):this(){

        this.type = type
        this.model = model
        this.price = price
        this.milesDrive = milesDrive
        this.owner = owner
    }

// second constructor
    constructor(type:String):this(){

        this.type = type

    }
    // main method or entry point of this class
//    init {
//        println("type : $type")
//        println("model : $model")
//        println("price : $price")
//        println("milesDrive : $milesDrive")
//        println("owner : $owner")
//    }

    fun getCarPrice():Double{
        return this.price!! - (this.milesDrive!!.toDouble()*10)
    }
}


fun main(args: Array<String>) {
    val huCar = Casr("BMW",2017,1012.22,102,"Emdad");
    println("huCar : "+huCar.milesDrive)
    println("huCar Price : "+huCar.getCarPrice())
    val jenaCar = Casr("KA",2015,1011.30,122,"Habib");
    println("huCar Price : "+jenaCar.getCarPrice())
    val newCar = Casr("KA");
    println(newCar.type)
}

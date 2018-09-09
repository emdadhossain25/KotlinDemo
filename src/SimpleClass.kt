



class Car(var type:String, var model:Int, var price:Double, var milesDrive:Int, var owner:String){

    // main method or entry point of this class
//    init {
//        println("type : $type")
//        println("model : $model")
//        println("price : $price")
//        println("milesDrive : $milesDrive")
//        println("owner : $owner")
//    }

    fun getCarPrice():Double{
        return this.price - (this.milesDrive.toDouble()*10)
    }
}


fun main(args: Array<String>) {
    val huCar = Car("BMW",2017,1012.22,102,"Emdad");
    println("huCar : "+huCar.milesDrive)
    println("huCar Price : "+huCar.getCarPrice())
    val jenaCar = Car("KA",2015,1011.30,122,"Habib");
    println("huCar Price : "+jenaCar.getCarPrice())
}

interface op{
    fun sum(n1:Int, n2:Int) {
        println(n1+n2)}
    fun div(n1:Int, n2:Int){
        println(n1/n2)}
}

class UserOp:op{
    override fun sum(n1: Int, n2: Int) {

        println(n1+n2)
    }

    override fun div(n1: Int, n2: Int) {
        println(n1/n2)
    }

}


class ManagerOp:op{


}


class AdminOp:op{
    override fun sum(n1: Int, n2: Int) {

        println(n1+n2-2)
    }

    override fun div(n1: Int, n2: Int) {
        println(n1/n2-2)
    }

}


fun main(args: Array<String>) {
    var adminOp = AdminOp()
    adminOp.sum(3,4)

    var managerOp = ManagerOp()
    managerOp.div(12,32)

    var userOp = UserOp()
    userOp.div(4,2)

}
// abstract class can not be isntanstiated
abstract class CreditCard(){
    fun credId():String{
        return "232332323"
    }
    abstract fun newCreditCard()
}

class UserInfo:CreditCard(){
    fun getUserInfo():String{
        return credId()
    }

    override fun newCreditCard() {
        print("new credit card")
    }
}

fun main(args: Array<String>) {
    var creditCard = UserInfo()
    println(creditCard.getUserInfo())

    var newCreditCard = creditCard.newCreditCard()
}
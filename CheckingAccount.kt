/*
* @author Abel Almeida
*
* Checking Account class to represent a checking account
*/

// run
//kotlinc CheckingAccount.kt -include-runtime -d CheckingAccount.jar
//java -jar CheckingAccount.jar
//class CheckingAccount( number: String, customer: Customer, balance: Double){
class CheckingAccount(number : String, customer : Customer, balance : Double) : Account(number, customer, balance){
    override fun accrue(rate: Double){ }
    }

/*
* @author Abel Almeida
*
* Checking Account class to represent a checking account
*/

/*
* Command line arguments to compile CheckingAccount.kt 
* kotlinc CheckingAccount.kt -include-runtime -d CheckingAccount.jar
*
* Run this class
* java -jar CheckingAccount.jar
*
*/

class CheckingAccount(number : String, customer : Customer, balance : Double) : Account(number, customer, balance){
    override fun accrue(rate: Double){ }
    }

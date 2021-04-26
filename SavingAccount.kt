/*
* @author Abel Almeida
*
* Saving Account class to represent a saving account
*/

/*
* Command line arguments to compile SavingAccount.kt 
* kotlinc SavingAccount.kt -include-runtime -d SavingAccount.jar
*
* Run this class
* java -jar SavingAccount.jar
*
*/

class SavingAccount(number : String, customer : Customer, balance : Double) : Account(number, customer, balance) {

    override fun accrue(rate: Double){
      interest += (balance * rate)
      balance += (balance * rate)
    }
}

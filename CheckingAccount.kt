/*
* @author Abel Almeida
*
* Checking Account class to represent a checking account
*/

// run
//kotlinc CheckingAccount.kt -include-runtime -d CheckingAccount.jar
//java -jar CheckingAccount.jar

import Account.kt
//class CheckingAccount( number: String, customer: Customer, balance: Double){
class CheckingAccount(override number: String, override customer: Customer, override balance: Double) Account(number, customer, balance){
    val number: String
    val customer: Customer
    val balance: Double

    init{                    // initialize the object Checking Account
      this.number = number
      this.customer = customer
      this.balance = balance

        }


    fun accrue(rate: Double){ }
    
    }

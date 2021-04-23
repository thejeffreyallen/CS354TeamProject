/*
* @author Jeff Allen
*
* An abstract base class to represent a bank account
*/
import Customer.jar
// Class must be abstract since it contains an abstract function definition
abstract class Account (protected var number : String, protected var customer : Customer, protected var balance : Double) { 

  //Must be abstract since there is no function body
  abstract fun accrue(rate : Double) 

  fun deposit(amt : Double) {
    balance += amt
  }

  // Used protected keyword to keep anyone from being able to withdraw money
  protected fun withdraw(amt : Double) { 
    balance -= amt
  }

  // Must use override keyword since every class inherits a toString() from the 'Any' class
  override fun toString() : String = "$number : "+customer.name+" : $balance"
}

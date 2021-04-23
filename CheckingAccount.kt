
class CheckingAccount( number: String, customer: Customer, balance double){
//class CheckingAccount(override number: String, override customer: Customer, override balance double) Account(number, customer, balance){
    val number: String
    val customer: Customer
    val balance: double

    init{                    // initialize the object Checking Account
      this.number = number
      this.customer = customer
      this.balance = balance

        }


    fun accrue(rate: double){ }
    
    }

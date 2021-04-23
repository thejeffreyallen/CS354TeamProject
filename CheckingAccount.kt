
class CheckingAccount( number: String, customer: Customer, balance double){
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

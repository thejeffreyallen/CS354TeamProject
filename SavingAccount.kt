
class SavingAccount( number: String, customer: Customer, balance double){
    val number: String
    val customer: Customer
    val balance: double
    val interest: double
    init{                    // initialize the object Saving Account
      this.number = number
      this.customer = customer
      this.balance = balance

        }


    fun accrue(rate: double){ }
      interest += (balance * rate)
      balance += (balance * rate)
    }

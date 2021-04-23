
class SavingAccount( number: String, customer: Customer, balance double){
//class SavingAccount(override number: String, override customer: Customer, override balance double) Account(number, customer, balance){
    val number: String
    val customer: Customer
    val balance: double
    val interest: double
    init{                    // initialize the object Saving Account
      this.number = number
      this.customer = customer
      this.balance = balance

        }


    override fun accrue(rate: double){ }
      interest += (balance * rate)
      balance += (balance * rate)
    }

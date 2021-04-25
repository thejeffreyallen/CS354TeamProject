
class SavingAccount(number : String, customer : Customer, balance : Double) : Account(number, customer, balance) {

    override fun accrue(rate: Double){
      interest += (balance * rate)
      balance += (balance * rate)
    }
}

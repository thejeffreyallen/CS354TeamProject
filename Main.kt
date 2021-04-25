fun main() {
  		val bank = Bank()
  		Customer("Ann").let {
  			bank.add(CheckingAccount("01001",it, 100.00))
  			bank.add(SavingAccount("01002",it, 200.00))
		}
  		bank.accrue(0.02)
  		println(bank.toString())
	}
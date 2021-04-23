/*
* @author Jeff Allen
*
* A class to represent a bank
*/
class Bank() {
	// I want the set to be mutable and retain order of accounts added
	val accounts : MutableSet<Account> = LinkedHashSet()

	/*
	* Add function - Adds an account to the bank's set of accounts
	*
	* @param account - The account to add 
	*/
	fun add(account : Account) {
		accounts.add(account)
	}

	/*
	* Accrue function - Loops through each account and calls their respective accrue functions
	*
	* @param rate - The rate at which to accrue interest
	*/
	fun accrue(rate : Double) {
		for (account in accounts)
	    	account.accrue(rate)
    }

    /*
	* toString function - Loops through each account and calls their respective toString functions
	*/
    override fun toString() : String {
	var r : String =""
	for (account in accounts)
	    r+=account.toString()+"\n"
	return r
    }
}


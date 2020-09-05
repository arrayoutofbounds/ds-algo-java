package basics;

public class CreditCard {
	private String customer;
	private String bank;
	private String account;
	private int limit;
	protected double balance;
	
	
	public CreditCard(String cust, String bk, String acnt, int lim, double initalBal) {
		customer = cust;
		bank = bk;
		account = acnt;
		limit = lim;
		balance = initalBal;
	}
	
	public CreditCard(String cust, String bk, String acnt, int lim) {
		this(cust, bk, acnt, lim, 0);
	}
	
	public String getCustomer() {
		return customer;
	}

	public String getBank() {
		return bank;
	}


	public String getAccount() {
		return account;
	}


	public int getLimit() {
		return limit;
	}

	public double getBalance() {
		return balance;
	}
	
	public boolean charge(double price) {
		if(price + balance > limit) {
			return false;
		}
		balance += price;
		return true;
	}
	
	public void makePayment(double amount) {
		balance -= amount;
	}
	
	// can access private instance variable since its the same entity class
	public static void printSummary(CreditCard card) {
		System.out.println("Customer " + card.customer);
		System.out.println("Bank " + card.bank);
		System.out.println("Account " + card.account);
		System.out.println("Limit " + card.limit);
		System.out.println("Balance" + card.balance);
	}
	
	public static void main(String[] args) {
		CreditCard[] wallet = new CreditCard[3];
		wallet[0] = new CreditCard("Ad", "cba", "1234", 500);
		wallet[1] = new CreditCard("Ad", "cba", "1234", 500);
		wallet[2] = new CreditCard("Ad", "cba", "1234", 500);
		
		for(int val = 1; val<=16; val++) {
			wallet[0].charge(3*val);
			wallet[1].charge(2*val);
			wallet[2].charge(val);
		}
		
		for(CreditCard card: wallet) {
			CreditCard.printSummary(card);
			while(card.getBalance() > 200.0) {
				card.makePayment(200);
				System.out.println("New balance " + card.getBalance());
			}
		}
	}
}

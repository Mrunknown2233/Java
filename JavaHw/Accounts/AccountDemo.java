	class Account
	{
		private int accountNumber;
		private double balance;

		Account(int accountNumber,double balance)
		{
			this.accountNumber = accountNumber;
			this.balance = balance;
		}

		double getBalance(){return this.balance;}
		void setBalance(double balance){this.balance = balance;}

		void deposit(double amount) throws IllegalArgumentException
		{
			if (amount<0)
				throw new IllegalArgumentException("amount cannot be negative");
			this.balance += amount;
			System.out.println("Balance after depositing " + amount  + "is : " + this.balance);
		}

		void withdraw(double amount) throws IllegalArgumentException
		{
			if (amount<0)
				throw new IllegalArgumentException("amount cannot be negative");
			if (balance < amount)
					throw new IllegalArgumentException("minimum balance violation " + this.balance);

			this.balance -= amount;
			System.out.println("Balance after withdrawing " + amount +	"is : " + this.balance);
		}

		public String toString()
		{
			return "Account : [" + this.accountNumber +  ", " + this.balance + "]";
		}
	}


	class SavingAccount extends Account
	{
		private static double rateOfInterest;

		static
		{rateOfInterest = 0.04; //4%
	}

		SavingAccount(int accountNumber,double balance)
		{
			super(accountNumber,balance);
		}

		void calculateAndDepositInterest()
		{	
			double InterestAmount  = rateOfInterest * this.getBalance();

			this.deposit(InterestAmount);
			System.out.println("Interest Deposited");
		}
	}


class CurrentAccount extends Account
{
    private double overdraftAmount;

    CurrentAccount(int accountNumber, double balance, double overdraftAmount)
    {
        super(accountNumber, balance);
        this.overdraftAmount = overdraftAmount;
    }

    void withdraw(double amount) throws IllegalArgumentException
    {
        if (amount < 0)
            throw new IllegalArgumentException("Amount cannot be negative");
        
        if (this.getBalance() + overdraftAmount < amount)
            throw new IllegalArgumentException("Insufficient balance including overdraft. Current balance: " + this.getBalance());

        this.setBalance(this.getBalance() - amount);
        System.out.println("Balance after withdrawing " + amount + " is: " + this.getBalance());
    }
}

	public class AccountDemo
	{
		public static void main(String[] args) 
		{
			SavingAccount s = new SavingAccount(24111124,10000);
			CurrentAccount c = new CurrentAccount(11424211,5000000,500000);

			System.out.println(s);
			System.out.println(c);

			s.deposit(10000);
			s.withdraw(5000);
			s.calculateAndDepositInterest();

			c.withdraw(4500000);
			c.withdraw(1000000);
			// //c.withdraw(1);

			// c.deposit(1000000);
		}
	}

class Account
{
  private int balance;

  Account(int initialBalance)
  {
    this.balance = initialBalance;
  }
  
  synchronized void withdraw(int amount)
  {
    System.out.println("Going to withdraw : " + amount);
    while(this.balance<amount)
    {
      try
      {
        System.out.println("Going to wait as balance is low");
        wait();
        System.out.println("Someone deposited, so i am active again ...");
      }
      catch(InterruptedException e)
      {
        e.printStackTrace();
      }

    }
    this.balance -= amount;
    System.out.println("Balance after withdraw : " + this.balance);
  }

  synchronized void deposit(int amount)
  {
    System.out.println("Going to deposit: " + amount);
    this.balance += amount;
    System.out.println("Balance after deposit: " + this.balance);
    notifyAll();
  }
}

class WithdrawThread implements Runnable
{
  Thread t;
  Account ref;
  int amount;

  WithdrawThread(Account acc,int amount)
  {
    t = new Thread(this);
    this.ref = acc;
    this.amount = amount;
    t.start();
  }
  

  public void run()
  {
    ref.withdraw(amount);
  }
}

class DepositThread implements Runnable
{
  Thread t;
  Account ref;
  int amount;

  DepositThread(Account acc, int amount)
  {
    t = new Thread(this);
    this.ref = acc;
    this.amount = amount;
    t.start();
  }

  public void run()
  {
    ref.deposit(amount);
  }
}


public class Banking
{
  public static void main(String[] args) 
  {
    Account acc1 =  new Account(10000);
    new WithdrawThread(acc1,15000);
    new WithdrawThread(acc1,22000);
    new DepositThread(acc1,50000);
  }
}

class Account
{
  private int balance;
  private int attempts;
  Account(int initialBalance)
  {
    this.balance = initialBalance;
  }
  
  synchronized void withdraw(int amount)
  {
    attempts = 1;
    System.out.println("Going to withdraw : " + amount);
    while(this.balance<amount && attempts<=3)
    {
      try
      {
        System.out.println("Going to wait as balance is low for " + attempts + " times");
        wait(2000); //waits for 2 seconds and if within that time no thread deposits to make the amount positive it will increment the attempts by 1 and again wait for 2 seconds. This will be kept on repeat until value of attempt becomes 3.
        attempts++;
      }
      catch(InterruptedException e)
      {
        e.printStackTrace();
      }

    }
    if (attempts<=3)
    {
        this.balance -= amount;
        System.out.println("Balance after withdraw : " + this.balance);
    }
    else
    {
        System.out.println("Wait time over");
    }
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

class Banking2_0 
{
public static void main(String[] args) 
  {
    Account acc1 =  new Account(11000);
    
    // new WithdrawThread(acc1,22000);
    new DepositThread(acc1,1000);
    new DepositThread(acc1,1000);
    new DepositThread(acc1,1000);
    new WithdrawThread(acc1,15000);
  }
}

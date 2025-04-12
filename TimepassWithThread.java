import java.util.Random;
class Odd implements Runnable
{
    Thread t;
    int max;
    Odd(int max)
    {
        this.max = max;
        t = new Thread(this,"Odd Thread");
        t.start();
    }

    public void run()
    {
        try
        {
            int i;
            for(i=1; i<=max; i+=2)
            {
                System.out.println(t.getName() + " : " + i);
                Thread.sleep(new Random().nextInt(1000));
            }
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
class Even implements Runnable
{
    Thread t;
    int max;
    Even(int max)
    {
        this.max = max;
        t = new Thread(this,"Even Thread");
        t.start();
    }

    public void run()
    {
        try
        {
            int i;
            for(i=0; i<=max; i+=2)
            {
                System.out.println(t.getName() + " : " + i);
                Thread.sleep(new Random().nextInt(1000));
            }
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
class TimepassWithThread 
{
    public static void main(String args[]) 
	{
        try
        {
            Odd  o = new Odd(10);
            Even  e = new Even(10);

            o.t.join();
            while(e.t.isAlive()); //=> is same as e.t.isAlive();
            System.out.println("Exiting main");
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}

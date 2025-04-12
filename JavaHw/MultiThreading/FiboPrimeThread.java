class ForFibo extends Thread
{
    private int a = 0,b = 1,c = 0;
    private int max;
    ForFibo(int max)
    {
        this.max = max;
        this.setName("FiboThread");
        this.start();
    }
    public void run()
    {
        if(max>=0)
            System.out.println("Fibonacci Series of  " + max + "  is  1 " );
        if(max>=1)
            System.out.println(b + " ");
        if (max > 1)
        {
            for(int i = 0; i <= max-2; i++)
            {
                c = a + b;
                a = b;
                b = c;

                System.out.println("From "+this.getName()+" "+c);
            }
        }
    }
}

class ForPrime extends Thread
{
    int max;
    ForPrime(int max)
    {
        this.max = max;
        this.setName("PrimeThread");
        this.start();
    }
    public void run()
    {
        int j = 0;
        System.out.println("Prime nos for 1 to " + max + " are shown by thread " + this.getName());
        for(int i = 1; i<= max; i++)
        {
            for(j = 2;j<Math.sqrt(i);j++)
            {
                if(i%j==0)
                    break;
            }
            if (j>=Math.sqrt(i))
            {
                System.out.println("From " + this.getName() + " "+ i);
            }
            i++;
        }
    }
}
class FiboPrimeThread 
{
    public static void main(String args[]) 
	{
        new ForFibo(30);
        new ForPrime(100);
    }
}

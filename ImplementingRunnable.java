class MyThread implements Runnable
{
  Thread t;
  MyThread()
  {
    t = new Thread(this);
    t.start(); 
  }

  public void run()
  {
    for (int i=0; i<10; i++)
    {
      try
      {
       System.out.println("MyThread "+i);
       Thread.sleep(250);
      }
      catch(InterruptedException e)
      {
        e.printStackTrace();
      }
    }
  }
}

public class ImplementingRunnable
{
  public static void main(String args[])
  {
   MyThread myT = new MyThread();

   //Thread t = new Thread(myT);
   //t.start(); 
  

    for (int i=10; i>0; i--)
    {
      try
      {
        System.out.println("Main Thread : " + i);
        Thread.sleep(250);
      }
      catch(InterruptedException e)
      {
        e.printStackTrace();
      }
    }
  }
}





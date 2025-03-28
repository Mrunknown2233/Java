class MyThread extends Thread
{
  MyThread()
  {
    start();
  }
  public void run()
  {
    System.out.println("My Thread start");
    for (int i=0; i<10; i++)
    {
      System.out.println(this + " i :" + i);
      try 
      {
        Thread.sleep(250); //in milliseconds
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

    }
  }
}
class MultiThreading 
{
  public static void main(String[] args) 
  {
    System.out.println("Inside main");  
    MyThread t = new MyThread();
    //t.start(); =>Taken care in the constructor
    for(int i=0; i<10; i++)
    {
      System.out.println("Main i: "+ i);
      try
      {
        Thread.sleep(250); //=>In milliseconds
      }
      catch(InterruptedException e )
      {
        e.printStackTrace();
      }
    }
  }  
}

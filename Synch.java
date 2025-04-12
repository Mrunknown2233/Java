class Callme
{
  /*synchronized*/void call(String msg)
  {
    System.out.println("[" + msg);
    try
    {
      Thread.sleep(500);
    }
    catch(InterruptedException e)
    {
      e.printStackTrace();
    }
    System.out.println("]");
  }
}

class Caller implements Runnable
{
  Thread t;
  Callme ref;
  String msg;


  Caller(Callme ref, String msg)
  {
    t = new Thread(this);
    this.ref = ref;
    this.msg = msg;
    t.start();
  }

  public void run()
  {
    synchronized(ref)
    {
      ref.call(msg);
    }
  }
}


public class Synch 
{
  public static void main(String args[]) 
  {
    Callme c1 = new Callme();
    new Caller(c1,"Hello");
    new Caller(c1,"World");
    new Caller(c1,"Synchronized");
  }  
}

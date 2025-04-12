class SharedMethod
{
	synchronized   void methodA(SharedMethod ref1)
	{
		System.out.println("Entered method A with " + Thread.currentThread().getName());
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("Entering method B with ref through thread" + Thread.currentThread().getName());
		ref1.methodB(this);
	}
	synchronized   void methodB(SharedMethod ref1)
	{
		System.out.println("Entered method B with " + Thread.currentThread().getName());
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("Entering method A with ref through thread " + Thread.currentThread().getName());
		ref1.methodA(this);
	}
}


class T1 implements Runnable
{
	Thread t1;
	SharedMethod m1,m2;
	T1(SharedMethod ref1,SharedMethod ref2)
	{
		t1 = new Thread(this);
		m1 = ref1;
		m2 = ref2;
		t1.start();
	}
	public void run()
	{
		m1.methodA(m2);
	}
}

// class T2 implements Runnable
// {
// 	Thread t2;
// 	SharedMethod m2,m1;
// 	T2(SharedMethod ref1,SharedMethod ref2)
// 	{
// 		t2 = new Thread(this);
// 		m2 = ref2;
// 		m1 = ref1;
// 		t2.start();
// 	}
// 	public void run()
// 	{
// 		m2.methodB(m1);
// 	}
// }

class CreateDeadlock
{
	public static void main(String[] args) 
	{
		SharedMethod obj1 = new SharedMethod();	
		SharedMethod obj2 = new SharedMethod();
		T1 thread1 = new T1(obj1,obj2);
  // T2 thread2 = new T2(obj1,obj2);
		T1 thread2 = new T1(obj2,obj1);
	}
}
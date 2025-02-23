interface A
{
    void method1();
}

interface B 
{
    void method2();
}

interface C extends A,B
{
    void method3();
}

class Sample implements C
{
    public void method1()
    {
        System.out.println("method1 of Sample");
    }

    public void method2()
    {
        System.out.println("method2 of Sample");
    }

    public void method3()
    {
        System.out.println("method3 of Sample");
    }

    void myOwnMethod()
    {
        System.out.println("myOwnMethod of sample");
    }
}

public class ExtendingInterface 
{
    public static void main(String args[]) 
	{
        Sample s = new Sample();
        s.method1();
        s.method2();
        s.method3();
        s.myOwnMethod();
    }
}

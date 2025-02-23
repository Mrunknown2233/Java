interface VariableDemo
{
    float PI = 3.14F;
}

class Sample implements VariableDemo
{
    void show()
    {
        //PI = 14.3F ->gives error
        System.out.println(VariableDemo.PI);
        System.out.println(Sample.PI);
    }
}
public class VariablesInInterface 
{
    public static void main(String args[]) 
	{
        new Sample().show();
    }
}

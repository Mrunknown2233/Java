package p2;
class Derived2 extends p1.Protection
{
    Derived2()
	{
        System.out.println("Inside Derived");
       // System.out.println("pri_n : " + pri_n);
       // System.out.println("n : " + n);
       System.out.println("pro_n : " + pro_n);
       System.out.println("pub_n : " + pub_n);        
    }
}

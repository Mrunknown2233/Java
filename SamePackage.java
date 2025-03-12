package p1;
public class SamePackage 
{
    SamePackage()
    {
        System.out.println("Inside SamePackage");
        Protection p = new Protection();
       // System.out.println("p.pri_n : " + p.pri_n);
       System.out.println("p.n : " + p.n);
       System.out.println("p.pro_n : " + p.pro_n);
       System.out.println("p.pub_n : " + p.pub_n);
    }
}

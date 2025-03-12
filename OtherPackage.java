package p2;
 class OtherPackage 
{
    OtherPackage()
	{
        System.out.println("Inside OtherPackage");
        p1.Protection p = new p1.Protection();
       // System.out.println("p.pri_n : " + p.pri_n);
       // System.out.println("p.n : " + p.n);
       // System.out.println("p.pro_n : " + p.pro_n);
       System.out.println("p.pub_n : " + p.pub_n);
    }
}

package p1;
public class Protection 
{
    private int pri_n = 1;
    int n = 2;
    protected int pro_n = 3;
    public int pub_n = 4;

    public Protection()
    {
        System.out.println("Inside Protection");
       System.out.println("pri_n : " + pri_n);
       System.out.println("n : " + n);
       System.out.println("pro_n : " + pro_n);
       System.out.println("pub_n : " + pub_n);
     }
}

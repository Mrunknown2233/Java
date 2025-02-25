/*
* This is a sample program for this keywrod and static keyword in java 
*/

class Student
{
    private String name;
    private String branch;
    private int rollNo;
    private int prn;
    private static int prnCounter,compsCounter,itCounter;

    public Student(String name,String branch)
    {
        prnCounter++;
        this.prn = prnCounter;
        this.name = name;
        this.branch = branch;

        if(branch.equals("IT"))
            this.rollNo = ++itCounter;
        else
            this.rollNo = ++compsCounter;
            
    }

    public void display()
    {
        System.out.println("====Student Info ====");
        System.out.println("PRN = " + prn);
        System.out.println("Rollno = " + rollNo);
        System.out.println("Name = " + name);
        System.out.println("Branch = "+ branch);
    }
}


public class StudentDemo
{
    public static void main(String args[])
    {
        Student s1,s2,s3;
        s1 = new Student("Soumya","Comps");
        s2 = new Student("Mahatre","IT");
        s3 = new Student("Andy","IT");

        s1.display();
        s2.display();
        s3.display();
        
    }
}

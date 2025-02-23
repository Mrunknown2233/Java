class Student
{   
    int rollNo;
    String name;

    void set(int rollNo,String name)
    {
        this.rollNo = rollNo;
        this.name = name;
    }

    void display()
    {
        System.out.println("RollNo =  " + rollNo);
        System.out.println("Name =  " + name);
    }
}
    public class ArrayOfObjects 
{
    public static void main(String args[]) 
	{
        int rollNos[] = {1,2,3,4,5};
        String names[] = {"Soumya","John","ABC","PQR","QWERTY"};

        Student s[] = new Student[5];

        for(int i = 0; i<s.length; i++)
            s[i] = new Student();

        for(int i = 0; i<s.length; i++)
            s[i].set(rollNos[i],names[i]);

        for(int i = 0; i<s.length; i++)
            s[i].display();    
    }
}

/***
 * WAP to create a class Student having member variables as EnrollmentNo , rollNo, percentage, branch;
 * Sort and Display according to 
 * EnrollmentNo wise
  * RollNo wise
  * Percentage wise
  * Branch wise
  * Branch in combination with any 3
  * EnrollmentNo in combination with any 3
  * Rollno in combination with any 3
  * Percentage in combination with any 3
  */



class Student
{
	//counter variables for enrollmentNo and rollNo
		private static int enrollmentCounter;
		private static int CompsrollCounter;
		private static int ItrollCounter;
		private static int MechrollCounter;
		static
		{
			enrollmentCounter = 0 ;
			CompsrollCounter = 0;
			ItrollCounter = 0;
			MechrollCounter = 0;
		}
	//reg member variables
		private int enrollmentNo;
		private int rollNo;
		private double percentage;
		private String name;
		private String branch;

	// Student(String name, String branch, double percentage)
	// {
			// this.enrollmentNo = ++enrollmentCounter;
			// if(branch.equalsIgnoreCase("Comps"))
			// 	this.rollNo = ++CompsrollCounter;
			// else if (branch.equalsIgnoreCase("It"))
			// 	this.rollNo = ++ItrollCounter;
			// else if (branch.equalsIgnoreCase("Mech"))
			// 	this.rollNo = ++MechrollCounter;
			// this.name = name;
			// this.branch = branch;
			// this.percentage = percentage;
	// }
		void set(String name, String branch, double percentage)
    	{
			this.enrollmentNo = ++enrollmentCounter;

			if(branch.equalsIgnoreCase("Comps"))
				this.rollNo = ++CompsrollCounter;
			else if (branch.equalsIgnoreCase("It"))
				this.rollNo = ++ItrollCounter;
			else if (branch.equalsIgnoreCase("Mech"))
				this.rollNo = ++MechrollCounter;

			this.name = name;
			this.branch = branch;
			this.percentage = percentage;
    		}

		int  getStudentRollNo(){return this.rollNo;}
		int  getStudentEnrollmentNo(){return this.enrollmentNo;}
		double getStudentPercentage(){return this.percentage;}
    	String getStudentBranch(){return this.branch;}

		void settStudentRollNo(int rollNo){this.rollNo =  rollNo;}
		// void setStudentEnrollmentNo(int enrollmentNo){this.enrollmentNo =  enrollmentNo;}
		void setStudentPercentage(double percentage){this.percentage =  percentage;}

		public String toString()
		{
			return "enrollmentNo = " + enrollmentNo + " rollNo = " + rollNo + " name = " + name + " percentage = " +percentage + " branch = " + branch;
		}
}


class StudentSorter
{
	private static int compare(Student s1, Student s2 , String criteria)
	{
        int res = 0 ;
        {
		switch(criteria)
		{
				case  "1" : //for roll no
							if(s1.getStudentRollNo() > s2.getStudentRollNo())
								res = 1;
                            break;
				case  "2" : //for enrollmentNo
							if(s1.getStudentEnrollmentNo() > s2.getStudentEnrollmentNo())    
								res = 1;
                            break;
				case "3" : //for percentage
							if (s1.getStudentPercentage()>s2.getStudentPercentage())
								res = 1;
                            break;
            }
                if (res!=0)
                    return res;
		}
            return res;	
	}
	public static void sort(Student s[], String criteria)
	{
		int n = s.length;

		for(int i = 0; i < n-1; i++)
		{
			for(int j = 0; j < n -i-1; j++)
			{
				if(compare(s[j],s[j+1],criteria) > 0 )
				{
					Student temp  = s[j];
					s[j] = s[j+1];
					s[j+1] = temp;
				}
			}
		}
	}
}

class StudentDemo
{
	public static void main(String args[]) 
	{
		Student s[] = new Student[5];

        String names[] = {"Soumya","John","ABC","PQR","QWERTY"};
        String branchs[] = {"COMPS","IT","COMPS","IT","Comps"};
        double percentage[] = {89,80,85,90,70};

         for(int i = 0; i<s.length; i++)
         	 s[i] = new Student();
        for(int i = 0; i<s.length; i++)
            s[i].set(names[i],branchs[i],percentage[i]);

        System.out.println("Normal order");
        for(int i = 0; i<s.length; i++)
            System.out.println(s[i]);

		try
        {
            System.out.println("Sorted order");
            switch(args[0])
		  {
			 case "1" : //sorting by roll no
						StudentSorter.sort(s,args[0]);
						  for(int i = 0; i<s.length; i++)
							System.out.println(s[i]);	
						  break;
			 case "2" : //sorting by enrollmentNo
			     		StudentSorter.sort(s,args[0]);
						for(int i = 0; i<s.length; i++)
							System.out.println(s[i]);
						break;
			case "3" : //sorting by percentage
						StudentSorter.sort(s,args[0]);
						for(int i = 0; i<s.length; i++)
							System.out.println(s[i]);
						break;
            default :
                    System.out.println("Enter valid opts");

		  }
        }

        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Enter valid opts");
        }

	}
}

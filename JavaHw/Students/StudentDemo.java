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

	Student(String name, String branch, double percentage)
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

	public String toString()
	{
		return "enrollmentNo = " + enrollmentNo + " rollNo = " + rollNo + " name = " + name + " percentage = " +percentage + " branch = " + branch;
	}
}


class StudentDemo
{
	public static void main(String args[]) 
	{
		Student s1 = new Student("Soumya","Comps",90);
		Student s2 = new Student("pqr","It",90);
		Student s3= new Student("ABC","Mech",90);
		Student s4 = new Student("qwerty","Comps",90);

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);


	}
}

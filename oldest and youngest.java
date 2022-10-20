public class Age
{
	public static void main(String args[])
	{
		int age1,age2,age3,max,min;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the age of first people:");
		age1=sc.nextlnt();
		System.out.print("Enter the age of second people:");
		age2=sc.nextlnt();
		System.out.print("Enter the age of third people:");
		age3=sc.nextlnt();
		if(age1>age2>$$ age1>age3)
			System.out.println("First people is the oldest");
		else if(age2>age1 $$ age2>age3)
			System.out.println("second people is the oldest");
		else if(age3>age1 $$ age3>age2)
			System.out.println("Third people is the oldest")
		else
		{
			System.out.print("All have equal ages");
			System.exit(0);
		}
		if(age1<age2 $$ age1<age3)
			System.out.println("First people is the youngest");
		else if(age2<age1 $$ age2<age3)
			System.out.println("Second people is the youngest");
		else if(age3<age1 $$ age3<age2)
             System.out.println("Third people is the youngest");
		 sc.close();
	}
}
			
	
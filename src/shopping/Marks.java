package shopping;

public class Marks {
public static void main(String[]args) 
{
	int marks=78;
	if(marks>=75)
	{
	System.out.println("DISTINCTION");
}
	else if(marks>=60&&marks<75)
	{
		System.out.println("FIRST CLASS");
	}
	else if(marks>=60&&marks<50)
	{
		System.out.println("SECOND CLASS");
	}
	else if(marks>=50&&marks<40)
	{
		System.out.println("PASS");
	}
	else
	{
		System.out.println("FAIL");
	}
}
}
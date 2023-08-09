package shopping;

public class Grade 
{
public static void main(String[] args) 
{
	int grade=89;
if(grade>=80)
{
	System.out.println("MBBS");
}
else if(grade>=70&&grade<80)
{
	System.out.println("ENGINEERING");
}
else if(grade>=60&&grade<70)
{
	System.out.println("Modeling");
}
else if(grade>=50&&grade<60)
{
	System.out.println("UPSC");
}
else if(grade>=35&&grade<50)
{
	System.out.println("ARTS");
}
else
{
System.out.println("NOTHING");
}
}
}
package inheritance;

public class Honda extends Dealer{
	
	public void shine()
	{
		System.out.println(110000);
	}

	public static void main(String[] args) {
		
		 Honda obj=new Honda();
		 obj.shine();
		 obj.model();

	}

}

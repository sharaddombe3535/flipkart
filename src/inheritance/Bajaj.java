package inheritance;

public class Bajaj extends Dealer {
	
	public void pulsar()
	{
		System.out.println(150000);
	}
	

	public static void main(String[] args) {
		 Bajaj obj=new Bajaj();
		 obj.pulsar();
		 obj.model();
		 
		 

	}

}

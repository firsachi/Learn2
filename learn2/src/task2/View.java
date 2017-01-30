package task2;

public class View {
	
	public final String message = "\n Input \n \n balance = %d \n withdrawa = %d \n \n Output \n %s";
	
	public void message(String message){
		System.out.println(message);
	}
	
	public void message(double balance, double withdrawa, String value){
		message(String.format(message, (int) balance, (int) withdrawa, value));
	}

}

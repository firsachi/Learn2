package task1;

public class View {

	public void message(String value){
		System.out.println(value);
	}
	
	public void message(String string, String mod, int integer){
		message(String.format(string, mod, integer));
	}
}

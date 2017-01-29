package task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Controller {
	
	private View view;
	private Model model;
	private int array[];

	public Controller(View view, Model model){
		this.view = view;
		this.model = model;
		inputArray();
	}
	
	private void inputArray(){
		view.message(Messages.START_MESSAGES);
		int size = 5;
		array = new int[size];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < size; i++ ){
			array[i] = inputInt(scanner); 
		}
		scanner.close();
	}
	
	private int inputInt(Scanner scanner){
		int result = 0;
		try {
			view.message(Messages.INPUT_NUMBER);
			result = scanner.nextInt();
			return result;
		}catch (InputMismatchException e) {
			view.message(Messages.ERROR_NOT_NUMBER);
			scanner.nextLine();
		}
		return result;
	}
	
	public void showSumElement(){
		view.message(Messages.MESSAGES_DEFAULT,Messages.SUM, model.sumElementArray(array));
	}
	
	public void showMinElmentArray(){
		view.message(Messages.MESSAGES_DEFAULT, Messages.MIN, model.minElementArray(array));
	}
	
	public void showMaxElementArray(){
		view.message(Messages.MESSAGES_DEFAULT, Messages.MAX, model.maxElementArray(array));
	}
	
	public void modulusFirstAnd(){
		int modules[] = model.modulusFirstAndElement(array);
		view.message(Messages.MESSAGES_DEFAULT, Messages.FIRST_MODULE, modules[0]);
		view.message(Messages.MESSAGES_DEFAULT, Messages.END_MODULE, modules[1]);
	}
	
	public void secondLargest(){
		view.message(Messages.MESSAGES_DEFAULT, Messages.SECOND, model.secondLargestElement(array));
	}
}

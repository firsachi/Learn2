package task1;

public class Runner {

	public static void main(String[] args){
		View view = new View();
		Model model = new Model();
		Controller controller = new Controller(view, model);
		controller.showSumElement();
		controller.showMinElmentArray();
		controller.showMaxElementArray();
		controller.modulusFirstAnd();
		controller.secondLargest();
	}
}

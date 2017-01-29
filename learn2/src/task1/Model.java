package task1;

public class Model {
	
	public int sumElementArray(int array[]){
		int result = 0;
		for (int value : array){
			result += value;
		}
		return result;
	}
	
	public int minElementArray(int array[]){
		int result = array[0];
		for ( int i = 1; i < array.length; i++){
			if ( result > array[i]){
				result = array[i];
			}
		}
		return result;
	}
	
	public int maxElementArray(int array[]){
		int result = array[0];
		for (int i = 1; i < array.length; i++){
			if (result < array[i]){
				result = array[i];
			}
		}
		return result;
	}
	
	public int[] modulusFirstAndElement(int array[]){
		int result[] = new int[2];
		result[0] = Math.abs(array[0]);
		result[1] = Math.abs(array[array.length - 1]);
		return result;
	}
	
	public int secondLargestElement(int[] array){
		int bigElement = array[0];
		int secondBigElement = 0;
		for (int i = 0; i < array.length; i++){
			if (bigElement > array[i] && secondBigElement < array[i]){
				secondBigElement = array[i];
			}else if (bigElement < array[i]) {
				secondBigElement = bigElement;
				bigElement = array[i];
			}
		}
		return secondBigElement;
	}
}

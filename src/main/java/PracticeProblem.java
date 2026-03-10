public class PracticeProblem {

	public static void main(String args[]) {

		System.out.println(sum(5, 3));
	}

	public static int sum (int num1, int num2){

		int result;
		result = num1 + num2;
		return result;
	}
	
	public static int difference (int num1, int num2){
		int result = num1 - num2;
		return result;
	}

	public static double product (double num1, double num2){
		double result = num1 * num2;
		return result;
	}

	public static String removeFirst (String word){
		String newWord = word.substring(1);
		return newWord;
	}

	//Create your functions here

}

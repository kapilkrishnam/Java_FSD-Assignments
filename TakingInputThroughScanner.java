import java.util.Scanner;
class TakingInputThroughScanner{
	public static void main(String[] args) {

		Scanner theScan = new Scanner(System.in);

		System.out.println("Please enter two numbers");


		int firstNum = theScan.nextInt();

		int secondNum = theScan.nextInt();

		int result = firstNum + secondNum;

		System.out.println("Addition of numbers is : " + result);
	}
}
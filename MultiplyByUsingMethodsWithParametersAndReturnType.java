class MultiplyByUsingMethodsWithParametersAndReturnType
{
	public static void main(String[] args) 
	{

		new MultiplyByUsingMethodsWithParametersAndReturnType().input();
		
		}
		void input()

		{

		java.util.Scanner theScan = new java.util.Scanner(System.in);

		int firstValue = theScan.nextInt();	
		int secondValue = theScan.nextInt();
		int result = multiply(firstValue, secondValue);
		print(result);

	}


	int multiply(int firstValue, int secondValue){
		
		return (firstValue * secondValue);
	}
	void print(int resultValue){
		System.out.println(resultValue);
	}
}

class MultiplyTheBestOneByUsingThis{

	int firstValue, secondValue, result;

	public static void main(String[] args) {

		new MultiplyTheBestOneByUsingThis().takeInput();
	
	}

	void takeInput(){
		java.util.Scanner theScan = new java.util.Scanner(System.in);

		System.out.println("Enter two numbers to multiply:");

		this.firstValue = theScan.nextInt();	
		this.secondValue = theScan.nextInt();

		this.multiply();

	}


	void multiply(){
		
		this.result = firstValue * secondValue;
		this.displayOutput();
	}

	void displayOutput(){
		System.out.println("Result is : " + this.result);
	}




}
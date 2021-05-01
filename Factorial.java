class Factorial{
	public static void main(String[] args) {
		int num=6, i=1;
		int factorial =1;
		while(i<= num)
		{
			factorial = factorial*i;
			i++;

		}
		System.out.println("Factorial of 6 is ="+ factorial);
	}
}
class FibonacciProgram
{
	public static void main(String[] args)
	 {
		int value1=0,value2=1,number=89;
		while(value1 <= number)
		{
			System.out.println(value1 );
			int sum = value1 + value2;
			value1 = value2;
			value2 = sum;
		}
	}
}
class SmartPhone{

	private long modelNumber;
	private String name;

	SmartPhone(long modelNumber, String name){
		this.modelNumber = modelNumber;
		this.name = name;
	}

	public long getModelNumber(){
		return this.modelNumber;
	}

	public void setModelNumber(long modelNumber){
		this.modelNumber = modelNumber;
	}

	public String getName(){
		return this.name;
	}

	public void setName(String name){
		this.name = name;
	}


}

class ConstructorImplementationExample{
	public static void main(String[] args) {
		SmartPhone firstPhone = new SmartPhone(242383, "x14"); //We are putting in a restriction here
		SmartPhone secondPhone = new SmartPhone(22396736, "e340");



		System.out.println(firstPhone.getModelNumber() + ", " + firstPhone.getName());
		System.out.println(secondPhone.getModelNumber() + ", " + secondPhone.getName());

	}
}
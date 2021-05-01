// Using the keyword static in java

class StaticDemo{

	static int var; //Don't share a relationship with objects of this class

	int value;

	public static void main(String[] args) {

		 StaticDemo demo = new StaticDemo();
		 // StaticDemo other = new StaticDemo();

		  // demo.var = 643; //Works -> StaticDemo.var = 643;
		 // StaticDemo.var = 643;
		 // var = 643;

		  // System.out.println(other.var); //0


		// StaticDemo.var = 742;
		 demo.doSomething(); //StaticDemo.doSomething(); //Because doSomething() is static
		
	}


	static void doSomething(){
		System.out.println("inside doSomething()...");
		//StaticDemo.func();

		 StaticDemo.value = 90; //? ALWAYS AN ERROR: can't use this within a static context


	}

	static void func(){
		System.out.println("inside func()..., var = " + StaticDemo.var);
	}
}
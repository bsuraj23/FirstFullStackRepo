package JavaPackage;

public class ConstructorTest {

	int a;
	String name;
	String noValue;

	 ConstructorTest() {
		// TODO Auto-generated method stub
		 System.out.println("this is no parameter constructor");
		 name = "Abhi";
	}
	
	public ConstructorTest(int b, int c)
	{
		
		a = b+c;
		System.out.println("this is the value of a "+ a);
		
	}
	
	ConstructorTest(String s) {
		
		System.out.println("this is the value of name is "+ s);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		ConstructorTest obj1 = new ConstructorTest(5 , 6);
		ConstructorTest obj2 = new ConstructorTest();
		ConstructorTest obj3 = new ConstructorTest("nametest");
		
		System.out.println("this is the value of name initialized in constructor "+ obj2.name);
		System.out.println("String noValue is set to ------ by compiler "+ obj3.noValue);
		
		

	}
}

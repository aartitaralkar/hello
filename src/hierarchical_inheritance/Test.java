package hierarchical_inheritance;

public class Test {
	public void methodB() {
		System.out.println("methods of class B");
		
	}
	public static void main(String[] args) {
		B obj1=new B();
		C obj2=new C();
		D obj3=new D();
		 obj1.methodA();
		 obj2.methodA();
		 obj3.methodA();
		 
		
	}
	

}

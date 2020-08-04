package SeleniumHierarchy;
class SuperClass1{
	public void super_print() {
		System.out.println("Super Print");
	}

	public void super_show() {
		System.out.println("Super Show");
	}
}

public class SubClass1 extends SuperClass1 {
	public void sub_print() {
		System.out.println("Sub Print");
	}

	public void sub_show() {
		System.out.println("Sub Show");
	}
	

	public static void main(String[] args) {
		SuperClass1 super1 =new SubClass1();
		super1.super_print();
		super1.super_show();
		
		SubClass1 sub1=(SubClass1)super1;
		sub1.sub_print();
		sub1.sub_show();
		

	}

}

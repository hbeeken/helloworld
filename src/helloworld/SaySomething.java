package helloworld;

public class SaySomething {

	public static void main(String[] args) {
		System.out.println("hello");
		SaySomething ss = new SaySomething();
		ss.foo();
	}
	
	public void foo() {
		System.out.println("foo bar foo");
	}

}

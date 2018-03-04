package day3;

public class Child extends Parent{

	public Child(int x) {
		super(x);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Child []";
	}

	/*@Override
	public void parentMethod() {
		// TODO Auto-generated method stub
		System.out.println("Child class");
	}*/
	
	
	public void print() {
		System.out.println("Child printing...");
	}
	
}
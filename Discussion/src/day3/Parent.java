package day3;

public class Parent {
	private int x;
	
	
	
	/*public Parent() {
		super();
	}*/

	public Parent(int x) {
		this.x = x;
	}
	
	public void parentMethod() {
		System.out.println(this.x);
	}

	@Override
	public String toString() {
		return "Parent [x=" + x + "]";
	}
}



package day3;

public class Main extends Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent c = new Child(5);
		c.parentMethod();
		
		//c.print();
		
		if(c instanceof Child) {
			((Child) c).print();
		}
	}

}

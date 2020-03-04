package protected_var_shape_class;

public class Shape {
	protected int sides;
	public Shape() {
		sides=3;
	}
	public int getSides() {
		return sides;
	}
   public void printSides() {
	   System.out.println("this obj has"+sides+"sides");
	   
   }
}

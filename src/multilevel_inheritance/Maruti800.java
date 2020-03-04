package multilevel_inheritance;

public class Maruti800 extends Maruti {
	public Maruti800() {
		System.out.println("constuctor of class maruti800");
	}
	
public void speed() {
	System.out.println("max spped 80kmph");
    }
public static void main(String[] args) {
	Maruti800 obj=new Maruti800();
	obj.VehicleType();
	obj.brand();
	obj.speed();
	
}
}

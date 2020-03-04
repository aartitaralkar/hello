package getter_setter;

//import inheritance.Car;

public class Test {
		public static void main(String[] args) {
			 Car b1=new Car();
			  b1.color=500;
			  b1.setSpeed(200);
			  b1.setSize(22);
			  b1.CC=1000;
			  b1.gears=5;
			  System.out.println("color of car:"+b1.color);
			  System.out.println("speed of car:"+b1.getSpeed());
			  System.out.println("size of car:"+b1.getSize());
			  System.out.println("CC of car:"+b1.CC);
			  System.out.println("no of gear of car:"+b1.gears);
			
		}
}

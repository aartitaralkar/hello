package multilevel2;


class Main {
 public static void main(String [] args) {
	 Employee e1=new Employee();
	 e1.name="aarti";
	 e1.age=26;
	 e1.ph=12344;
	 e1.specialization="java";
	 Manager m1=new Manager();
	 m1.name="java";
	 m1.age=27;
	 m1.ph=4769;
	 m1.department="HR";
	 System.out.println(e1.name);
	 System.out.println(e1.age);
	 System.out.println(e1.ph);
	 System.out.println(e1.specialization);
	 
	 System.out.println(m1.name);
	 System.out.println(m1.age);
	 System.out.println(m1.ph);
	 System.out.println(m1.department);
	
}
}

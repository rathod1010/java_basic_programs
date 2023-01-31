package oops_concept;

//Inheritance example in java
public class Programmer extends Employee {

	int bonus = 2000;

	public static void main(String args[]) {
		Programmer pg = new Programmer();
		System.out.println("Name of the employee : " + pg.name);
		System.out.println("Salary of programmer :" + pg.salary);
		System.out.println("Bonus of programmer :" + pg.bonus);
	}

}

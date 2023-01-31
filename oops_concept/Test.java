package oops_concept;

public class Test {
	
	public static void main(String args[])
	{
		Student s = new Student();
		s.setName("Raj");
		s.setGrade('B');
		s.setMobile(995227433);
		
		System.out.println(s.getName());
		System.out.println(s.getMobile());
		System.out.println(s.getGrade());
	}

}

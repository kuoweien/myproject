package oo.stati;

public class Tester {

	public static void main(String[] args) {
		System.out.println(Student.pass);
		Student s1 = new Student(87, 89, 65);
		Student s2 = new Student(65, 59, 85);
		s1.pass = 70;
		s1.print();
		s2.print();
		

	}

}

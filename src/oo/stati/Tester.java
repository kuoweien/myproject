package oo.stati;


import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		System.out.println(Student.pass);
		Student s1 = new Student(87, 89, 65);
		Student s2 = new Student(65, 59, 85);
		Graduatestudent gts1 = new Graduatestudent(65, 59, 85);
		Graduatestudent gts2 = new Graduatestudent(85, 91, 55);
		s1.pass = 70;
		s1.print();
		s2.print();
		gts1.print();
		
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student(87, 89, 65));
		list.add(new Student(65, 59, 85));
		list.add(new Graduatestudent(65, 59, 85));
		list.add(new Graduatestudent(85, 91, 55));
		for(int i = 0;i<list.size();i++){
			Student stu = list.get(i);
			stu.print();
		}
	}
	
}

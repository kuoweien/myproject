package oo.tester;

import java.util.ArrayList;
import java.util.Scanner;
import oo.stati.Student;

public class Tester {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<>();
	 	a.add("331");
		a.add("821");
		a.add("886");
		a.add("554");
		
		Scanner scanner = new Scanner(System.in); 
		System.out.println("��J�o�����X");
		String s = scanner.nextLine();
		String sub = s.substring(s.length()-3);
		
		if(sub.equals(a.get(0))||sub.equals(a.get(1))||sub.equals(a.get(2))||sub.equals(a.get(3))){
			System.out.println("���ߧA����!");
		}else{
			System.out.println("ݢ�t�F���n���L");
		}
		Student stu = new Student();
		
	}

}

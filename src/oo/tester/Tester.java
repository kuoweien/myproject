package oo.tester;

import java.util.ArrayList;
import java.util.Scanner;

//加入不同package的class
import oo.abstraction.Car;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<>();
	 	a.add("331");
		a.add("821");
		a.add("886");
		a.add("554");
		
		Scanner scanner = new Scanner(System.in); 
		System.out.println("輸入發票號碼");
		String s = scanner.nextLine();
		String sub = s.substring(s.length()-3);
		
		if(sub.equals(a.get(0))||sub.equals(a.get(1))||sub.equals(a.get(2))||sub.equals(a.get(3))){
			System.out.println("恭喜你中獎!");
		}else{
			System.out.println("摃龜了不要難過");
		}
		
	}

}

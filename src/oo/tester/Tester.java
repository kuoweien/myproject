package oo.tester;

import java.util.ArrayList;
import java.util.Scanner;

//加入不同package的class
import oo.abstraction.Car;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 
		System.out.println("輸入發票號碼");
		String s = scanner.nextLine();
		int n = Integer.parseInt(s);
		String k = "331";
		String t = "123456331";
		System.out.println(t.length());
		
		
	/*	Car c = new Car("T","A",1800);
        ArrayList<String> a = new ArrayList();
   //   String numbers[] = {"886","331","821"};
        a.add("886");
        a.add("331");
        a.add("821");
   //   a.add(123);
        System.out.println(a.size());
        a.set(2, "886");
        System.out.println(a);
        System.out.println(a.set(2, "886"));
        System.out.println(a);
        String data = (String)a.get(2);
   //   int n = (int)a.get(4);
      */
        //331 821 886 554
	}

}

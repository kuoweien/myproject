package oo.shopping;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		System.out.println("輸入消費金額");
		String s = scanner.nextLine();
		int i = Integer.parseInt(s);
		Custom cus = new Custom();
		cus.print();
		SilmCustom cus1 = new SilmCustom();
		cus1.print1();
		GoldenCustom cus2 = new GoldenCustom();
		cus2.print2();

	}

}

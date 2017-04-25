package oo.mid;

import java.util.Scanner;

import oo.abstraction.Car;

public class MealTeaster {

	public static void main(String[] args) {
		Meal m1 = new Meal(200,"beef","icecream");
		Meal m2 = new Meal(150,"chicken","french fries");
		Meal m3 = new Meal(200,"fish","apple pie");
		
		Meal[] meal = new Meal[3];
		meal[0] =  new Meal(200,"beef","icecream");
		meal[1] =  new Meal(150,"chicken","french fries");
		meal[2] =  new Meal(200,"fish","apple pie");
		
		Scanner scanner = new Scanner(System.in); 
		System.out.println("輸入你要的套餐號碼(0~2)");
		String s = scanner.nextLine();
		int n = Integer.parseInt(s);
		
		
		System.out.println("您的主餐為:"+meal[n].mainfood+ "附餐為"+meal[n].another+ "總價格為"+meal[n].price);
		
		
		

	}

}

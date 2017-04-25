package oo.mid;

public class Meal {
	int price;
	String mainfood;
	String another;
	public Meal(int price,String mainfood,String another){
		this.price=price;
		this.mainfood=mainfood;
		this.another=another;
	}
	public void p(){
		System.out.println(mainfood+another+price);
	}
}

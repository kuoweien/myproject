package oo.abstraction;

public class Car {
	String brand;
	String name;
	int cc;
	String type;
	int status;
	int id;
	float milage;
	public Car(String brand,String name){
		this(brand, name, 0);
		System.out.println("as");
		//this呼叫要在第一行
	}
	public Car(String brand,String name,int cc){
		this.brand = brand;
		this.name = name;
		this.cc = cc;
	}
	
	//Method:
	public void maintain(){
		status = 5;
		
	}
	
	public void setMilage(int m){
		milage = m;
	}
	public float addMilage(int m){
		milage = milage + m;
		return milage;
	}

}

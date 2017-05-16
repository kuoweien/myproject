package oo.shopping;


public class Custom extends Tester{
	int amount;
	public Custom(){
		super();
	}
	public Custom(int amount){
		this.amount = amount;
	}
	public void print(){
		System.out.println("一般客戶: " +amount+"\t"+amount+"\t"+"0");
	}
	

}

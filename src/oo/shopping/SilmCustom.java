package oo.shopping;

public class SilmCustom extends Custom{
	float discount = 0.9f;
	public SilmCustom() {
		super();
	}
	public SilmCustom(int amount){
		this.amount = amount;
	}
	@Override
	public void print(){
		System.out.println("銀級客戶: "+amount+"\t"+amount*discount+"\t"+"0");
	}
}
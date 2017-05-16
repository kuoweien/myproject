package oo.shopping;

public class GoldenCustom extends SilmCustom{
	float back= 0.05f;
	public GoldenCustom() {
		super();
	}
	public GoldenCustom(int amount){
		this.amount = amount;
	}
	public void print(){
		System.out.println("金級客戶: "+amount+"\t"+amount*discount+"\t"+amount*back);
	}

}

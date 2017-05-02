package oo.stati;

public class Student {
	int english;
	int math;
	int chinese;
	static int pass = 60;
	static{
		System.out.println("Static");
		//System.out.println(english);
		System.out.println(pass);
	}
	public Student(){
		//this.passs; static使pass不是物件
	}
	public Student(int english,int math, int chinese){
		this.chinese = chinese;
		this.english = english;
		this.math = math;
	}
	public void print(){
		System.out.println(getScore(english)+"\t"+getScore(math)+"\t"+getScore(chinese)+"\t");
	}
	protected String getScore(int score){
		if(score<pass){
			return String.valueOf(score)+"*";
		}else{
			return String.valueOf(score);
		}
	}
	
}

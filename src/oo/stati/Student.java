package oo.stati;

public class Student {
	int english;
	int math;
	int chinese;
	static int pass = 60;
	// pass變成類別變數
	public Student(int english,int math, int chinese){
		this.chinese = chinese;
		this.english = english;
		this.math = math;
	}
	public void print(){
		System.out.println(getScore(english)+"\t"+getScore(math)+"\t"+getScore(chinese)+"\t");
	}
	private String getScore(int score){
		if(score<pass){
			return String.valueOf(score)+"*";
		}else{
			return String.valueOf(score);
		}
	}
	
}

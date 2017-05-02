package oo.stati;

public class Graduatestudent extends Student{
	int thesis;
	public Graduatestudent(int english,int math, int chinese){
		this.chinese = chinese;
		this.english = english;
		this.math = math;
	}
	@Override
	public void print(){
		System.out.println(getScore(english)+"\t"+getScore(math)+"\t"+getScore(chinese)+"\t"+thesis);
	}
}

package oo.shopping;

import java.util.ArrayList;


public class Tester {

	public static void main(String[] args) {
		System.out.print("會員等級 "+"\t"+"消費金額"+"\t"+"折扣後"+"\t"+"回饋金額"+"\n");
		ArrayList<Custom> list = new ArrayList<>();
		list.add(new Custom(6000));
		list.add(new SilmCustom(6000));
		list.add(new GoldenCustom(6000));
//		for(int i=0;i<list.size();i++){
//			Custom cus = list.get(i);
		for(Custom cus : list){
			if (cus instanceof SilmCustom && !(cus instanceof GoldenCustom)){
				System.out.print("*");
				//轉型
				SilmCustom silm = (SilmCustom)cus;
			}
			cus.print();
		}
		//舉例
		String[] array = {"aa","bb","cc"};
		for(String s : array){
			System.out.println(s);
		
		}

	}

}

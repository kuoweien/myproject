package oo.abstraction;

public class CarTester {

	public static void main(String[] args) {
		
		Car c1 = new Car("TOYOTA", "ALTIS",1800);
		Car c2 = new Car("HONDA", "ACCORD",2000);
		Car c3 = new Car("TOYOTA", "WISH", 1800);
		
		int[] n = new int[5];
		System.out.println(n[2]);
		

		Car[] cars = new Car[3];
		cars[0] =  new Car("TOYOTA", "ALTIS",1800);
		cars[1] = new Car("HONDA", "ACCORD",2000);
		cars[2] = new Car("TOYOTA", "WISH", 1800);
		cars[0].id = 301;
		cars[1].id = 302;
		cars[2].id = 303;
		
		//System.out.println(cars[2]);
		System.out.println(cars[2].cc);
		
		for(int i=0 ; i<3 ; i++){
			System.out.print(cars[i].name+" ");
		}
		class AA{
			
		}
		AA a = new AA();
		
		Car c = new Car("Toyota", "Altis", 1800);
		c.setMilage(25000);
		float current = c.addMilage(80);
		System.out.println("�ثe�����ƬO:"+current);
	}

}

package oo.abstraction;

public class TicketsTester {

	public static void main(String[] args) {
		Ticket t1 = new Ticket(1800,"Red","1A");
		Ticket t2 = new Ticket(1500,"Yellow","10A");
		Ticket t3 = new Ticket(900,"Blue","50A");
		
		int n[] = new int[10];
		System.out.println(n[5]);
		//n[i]的值皆為0
		
		Ticket t[] = new Ticket[10];
		System.out.println(t[5]);
		//ticket[i]的值皆為null
		t[0] = new Ticket(1800,"Red","1A");
		t[1] = new Ticket(1500,"Yellow","10A");
		t[2] = new Ticket(900,"Blue","50A");
		System.out.println(t[2].level);
		
		for(int i = 0;i<=2;i++){
			System.out.println(t[i].level);
		}
	}

}

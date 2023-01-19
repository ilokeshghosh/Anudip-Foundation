package restaurant;

import java.util.*;

public class Billing {
	static ArrayList<Bill>  list = new ArrayList<Bill>();
	static String  coupon = "A12Z";
	static Scanner sc = new Scanner(System.in);
	
	static void order(String fname, int amt) {
		System.out.println("Enter the quantity for "+fname+" : ");
		int qty = sc.nextInt();
		list.add(new Bill(fname, qty, amt*qty));
	}
	
	static void cont() {
		System.out.println("Do you want to continue : y/n");
		char ch = sc.next().charAt(0);
		if((ch!='y')) {
			System.out.println();
			System.out.println("Do you have coupon : y/n");
			char ch2 = sc.next().charAt(0);
			if(ch2=='y') {
				sc.nextLine();
				System.out.println("Enter you Coupon code :");
				String uCoupon = sc.nextLine();
				if(uCoupon.equals(coupon)) {
					totalbill(120);
					System.exit(0);
				}	
				else {
					System.out.println("Invalid Coupon Code");
				}
			}
			else {
				totalbill(0);
				System.exit(0);
			}
		}
		
		
	}
	
	static void totalbill(int dis) {
		System.out.println("BILL");
		System.out.println("=======");
		System.out.println("ITEMS \tQUANTITY\t AMOUNT");
		System.out.println("=========");
		double total=0.0;
		
		for(Bill b: list) {
			System.out.println(b.fname+" \t"+b.qty+"\t₹"+b.amt);
			total = total+b.amt;
			
			
		}
		
		System.out.println();
		System.out.println("Amount Before Discount : ");
		System.out.println("Amount  ₹"+(total));
		total = total -dis;
		System.out.println("Amount After Discount : ");
		System.out.println("Amount  ₹"+(total));
		System.out.println("Discount Amount : ₹"+dis);
		double gst = total*0.05;
		System.out.println("GST : ₹"+gst );
		System.out.println("--------------");
		double famount = gst + total;
		System.out.println("Total : ₹"+famount);
	}
	
	
}

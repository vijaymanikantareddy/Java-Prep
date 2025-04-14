package com.flm;
import com.flm.db.DataBase;
import com.flm.cart.*;

public class Test {
	static int age = 10;
	String name = "Vijay";
	public static void main(String[] args) {
		System.out.println(age);
		
		// System.out.println(name); Error
		// System.out.println(Test.name); Error
 		Test t = new Test();
		System.out.println(t.name);
		
		DataBase d = new DataBase();
		d.connect();
		
		Cart.add();
		
		Cart c = new Cart();
		c.add();
		
		System.out.println(c.price);
	}
}

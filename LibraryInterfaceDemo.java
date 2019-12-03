/* Created by: javajesus817
 * Created on: 12/2/19
 * Updated on: 
 * Version: 1.0
 *  
 * */

package com.libraryusers.main;

public class LibraryInterfaceDemo {
	static KidUsers kid1;
	static KidUsers kid2;
	static AdultUser adult1;
	static AdultUser adult2;

	public static void main(String[] args) {
		kid1 = new KidUsers();
		kid2 = new KidUsers();
		
		kid1.setAge(10);
		kid2.setAge(18);
		kid1.setBookType("Kids");
		kid2.setBookType("Fiction");
		kid1.registerAccount();
		kid2.registerAccount();
		kid1.requestBook();
		kid2.requestBook();
		
		System.out.println("Kid 1 age: " + kid1.getAge());
		System.out.println("Kid 1 register: " + kid1.registerAccount());
		System.out.println("Kid 1 book type: " + kid1.getBookType());
		System.out.println("Kid 1 book request: " + kid1.requestBook());
		System.out.println("Kid 2 age: " + kid2.getAge());
		System.out.println("Kid 2 register: " + kid2.registerAccount());
		System.out.println("Kid 2 book type: " + kid2.getBookType());
		System.out.println("Kid 2 book request: " + kid2.requestBook());
		
		adult1 = new AdultUser();
		adult2 = new AdultUser();
		
		adult1.setAge(5);
		adult2.setAge(23);
		adult1.setBookType("Kids");
		adult2.setBookType("Fiction");
		adult1.registerAccount();
		adult2.registerAccount();
		adult1.requestBook();
		adult2.requestBook();
		
		System.out.println();
		System.out.println("Adult 1 age: " + adult1.getAge());
		System.out.println("Adult 1 register: " + adult1.registerAccount());
		System.out.println("Adult 1 book type: " + adult1.getBookType());
		System.out.println("Adult 1 book request: " + adult1.requestBook());
		System.out.println("Adult 2 age: " + adult2.getAge());
		System.out.println("Adult 2 register: " + adult2.registerAccount());
		System.out.println("Adult 2 book type: " + adult2.getBookType());
		System.out.println("Adult 2 book request: " + adult2.requestBook());
		
	}

}

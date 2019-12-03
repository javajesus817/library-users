package com.libraryusers.main;

public class KidUsers implements LibraryUserI {
	private int age;
	private String bookType;
	
	public KidUsers() {
		
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBookType() {
		return bookType;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

	@Override
	public String registerAccount() {
		if(this.age < 12) {
			return "You have successfully registered under a Kids Account";
		} else {
			return "Sorry, Age must be less than 12 to register as a kid";
		}
		
	}

	@Override
	public String requestBook() {
		if(this.bookType.equals("Kids")) {
			return "Book Issued successfully, please return the book within 10 days";
		} else {
			return "Oops, you are allowed to take only kids books";
		}
		
	}

}

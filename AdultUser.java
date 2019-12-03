package com.libraryusers.main;

public class AdultUser implements LibraryUserI {
	private int age;
	private String bookType;
	
	public AdultUser() {
		
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
		if(this.age > 12) {
			return "You have successfully registered under an Adult Account";
		} else {
			return "Sorry, Age must be greater than 12 to register as an adult";
		}
		
	}

	@Override
	public String requestBook() {
		if(this.bookType.equals("Fiction")) {
			return "Book Issued successfully, please return the book within 7 days";
		} else {
			return "Oops, you are allowed to take only adult Fiction books";
		}
	}

}

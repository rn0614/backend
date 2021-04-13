package com.di.spring_xml_value_setter;

public class Book {
	private String bookNo;
	private String BookName;
	private String BookAuthor;
	private int bookPrice;
	
	
	public String getBookNo() {
		return bookNo;
	}
	public void setBookNo(String bookNo) {
		this.bookNo = bookNo;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public String getBookAuthor() {
		return BookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		BookAuthor = bookAuthor;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	
	@Override
	public String toString() {
		return "Book [bookNo=" + bookNo + ", BookName=" + BookName + ", BookAuthor=" + BookAuthor + ", bookPrice="
				+ bookPrice + "]";
	}
}

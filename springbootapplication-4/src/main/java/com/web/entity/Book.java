package com.web.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {
	@Id
   private int bookId;
   private String bookName;
   private String author_name;
   private String isbn_no;
   private String publisher_name;
   private String publishing_year;
   private double price;
   
public Book() {
	super();
}

public Book(int bookId, String bookName, String author_name, String isbn_no, String publisher_name,
		String publishing_year, double price) {
	super();
	this.bookId = bookId;
	this.bookName = bookName;
	this.author_name = author_name;
	this.isbn_no = isbn_no;
	this.publisher_name = publisher_name;
	this.publishing_year = publishing_year;
	this.price = price;
}

public int getBookId() {
	return bookId;
}

public void setBookId(int bookId) {
	this.bookId = bookId;
}

public String getBookName() {
	return bookName;
}

public void setBookName(String bookName) {
	this.bookName = bookName;
}

public String getAuthor_name() {
	return author_name;
}

public void setAuthor_name(String author_name) {
	this.author_name = author_name;
}

public String getIsbn_no() {
	return isbn_no;
}

public void setIsbn_no(String isbn_no) {
	this.isbn_no = isbn_no;
}

public String getPublisher_name() {
	return publisher_name;
}

public void setPublisher_name(String publisher_name) {
	this.publisher_name = publisher_name;
}

public String getPublishing_year() {
	return publishing_year;
}

public void setPublishing_year(String publishing_year) {
	this.publishing_year = publishing_year;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

@Override
public String toString() {
	return "Book [bookId=" + bookId + ", bookName=" + bookName + ", author_name=" + author_name + ", isbn_no=" + isbn_no
			+ ", publisher_name=" + publisher_name + ", publishing_year=" + publishing_year + ", price=" + price + "]";
}
}
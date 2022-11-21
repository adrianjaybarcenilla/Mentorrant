package com.Mentorrant.mentorrant.Entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_ebooks")
public class EbooksEntity {
	
	private int bookId;
	private String bookAuthor;
	private String bookGenre;
	private int yearLevel;
	
	public EbooksEntity() {}

	public EbooksEntity(int bookId, String bookAuthor, String bookGenre, int yearLevel) {
		super();
		this.bookId = bookId;
		this.bookAuthor = bookAuthor;
		this.bookGenre = bookGenre;
		this.yearLevel = yearLevel;
	}

	public int getBookId() {
		return bookId;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getBookGenre() {
		return bookGenre;
	}

	public void setBookGenre(String bookGenre) {
		this.bookGenre = bookGenre;
	}

	public int getYearLevel() {
		return yearLevel;
	}

	public void setYearLevel(int yearLevel) {
		this.yearLevel = yearLevel;
	}
	
	
}

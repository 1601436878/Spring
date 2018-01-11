package bean;

import java.sql.Date;

public class Book_zuhe {
	private int id; 
	
	private String bookNum;
	
	private String bookName; 
	
	private String author; 
	
	private Publisher publish = new Publisher();
	
	private Date publishDate; 
	
	public Book_zuhe() {}

	public Book_zuhe(int id, String bookNum, String bookName, String author,
		Publisher publish) {
		super();
		this.id = id;
		this.bookNum = bookNum;
		this.bookName = bookName;
		this.author = author;
		this.publish = publish;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookNum() {
		return bookNum;
	}
	public void setBookNum(String bookNum) {
		this.bookNum = bookNum;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Publisher getPublish() {
		return publish;
	}
	public void setPublish(Publisher publish) {
		this.publish = publish;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
}

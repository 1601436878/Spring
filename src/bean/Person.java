package bean;

public class Person {
	private String name; 
	private int age; 
	private float height;
	private Book favouriteBook;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Person(String name, int age, float height, Book favouriteBook) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.favouriteBook = favouriteBook;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public Book getFavouriteBook() {
		return favouriteBook;
	}
	public void setFavouriteBook(Book favouriteBook) {
		this.favouriteBook = favouriteBook;
	}
	public void setBook(Book favouriteBook) {
		this.favouriteBook = favouriteBook;
	}
}

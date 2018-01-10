package bean;

public class Publisher {
	private int id; 
	
	private String publisherNum; 
	
	private String publisherName;
	
	private String publisherAddress;
	
	public Publisher() {}
	public Publisher(int id, String publisherNum, String publisherName, String publisherAddress) {
		super();
		this.id = id;
		this.publisherNum = publisherNum;
		this.publisherName = publisherName;
		this.publisherAddress = publisherAddress;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPublisherNum() {
		return publisherNum;
	}
	public void setPublisherNum(String publisherNum) {
		this.publisherNum = publisherNum;
	}
	public String getPublisherName() {
		return publisherName;
	}
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	public String getPublisherAddress() {
		return publisherAddress;
	}
	public void setPublisherAddress(String publisherAddress) {
		this.publisherAddress = publisherAddress;
	}
	
	

}

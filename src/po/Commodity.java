package po;

public class Commodity {
	private Integer id;
	private String cname;
	private double price;
	private String backGround="not yet";
	private int count=0;
	public Commodity(Integer id, String cname, double price, String backGround, int count) {
		super();
		this.id = id;
		this.cname = cname;
		this.price = price;
		this.backGround = backGround;
		this.count = count;
	}
	public Commodity(Integer id, String cname, double price, String backGround) {
//		super();
		this.id = id;
		this.cname = cname;
		this.price = price;
		this.backGround = backGround;
	}
	public Commodity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Commodity(Integer id, String cname, double price) {
//		super();
		this.id = id;
		this.cname = cname;
		this.price = price;
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String bname) {
		this.cname = bname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getBackGround() {
		return backGround;
	}
	public void setBackGround(String backGround) {
		this.backGround = backGround;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int id) {
		
		this.count++;
	}
	
	
}

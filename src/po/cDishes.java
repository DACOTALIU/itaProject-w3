package po;

public class cDishes {
	public String name;// dId
	public Double price;
	public int count;
	public int pic;
	public int flag;
	public cDishes(String name, Double price, int count, int pic, int flag) {
		super();
		this.name = name;
		this.price = price;
		this.count = count;
		this.pic = pic;
		this.flag = flag;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getPic() {
		return pic;
	}
	public void setPic(int pic) {
		this.pic = pic;
	}
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	public cDishes() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
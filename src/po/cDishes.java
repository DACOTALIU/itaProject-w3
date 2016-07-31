package po;

public class cDishes {
	public String dName;
	public double dPrice;
	public int pic;//dId
	public int dCount;
	public cDishes(String dName, double dPrice, int pic, int dCount, int flag) {
		super();
		this.dName = dName;
		this.dPrice = dPrice;
		this.pic = pic;
		this.dCount = dCount;
		this.flag = flag;
	}
	public int flag;
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	public cDishes(String dName, double dPrice, int pic, int dCount) {
		super();
		this.dName = dName;
		this.dPrice = dPrice;
		this.pic = pic;
		this.dCount = dCount;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public double getdPrice() {
		return dPrice;
	}
	public void setdPrice(double dPrice) {
		this.dPrice = dPrice;
	}
	public int getPic() {
		return pic;
	}
	public void setPic(int pic) {
		this.pic = pic;
	}
	public int getdCount() {
		return dCount;
	}
	public void setdCount(int dCount) {
		this.dCount = dCount;
	}
	
}

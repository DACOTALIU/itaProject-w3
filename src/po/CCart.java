package po;

public class CCart {
	public int cId;
	public String dishes;
	public CCart(int cId,  String dishes) {
		super();
		this.cId = cId;
		this.dishes = dishes;
	}
	public CCart() {
		// TODO Auto-generated constructor stub
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getdishes() {
		return dishes;
	}
	public void setdishes(String dishes) {
		this.dishes = dishes;
	}
	
}

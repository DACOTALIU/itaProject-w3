package po;

public class CCart {
	public int cId;
	public int dId;
	public CCart(int cId, int dId, int dNum) {
		super();
		this.cId = cId;
		this.dId = dId;
		this.dNum = dNum;
	}
	public int dNum;
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}
	public int getdNum() {
		return dNum;
	}
	public void setdNum(int dNum) {
		this.dNum = dNum;
	}
	
}

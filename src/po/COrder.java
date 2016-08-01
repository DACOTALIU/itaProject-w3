package po;

import javax.xml.crypto.Data;

public class COrder {
	int oId;
	CCart cart;
	long data;

	public COrder(int oId, CCart cart, long nowTime) {
		super();
		this.oId = oId;
		this.cart = cart;
		this.data = nowTime;
	}

	public COrder() {
		// TODO Auto-generated constructor stub
	}

	public int getoId() {
		return oId;
	}

	public void setoId(int oId) {
		this.oId = oId;
	}

	public CCart getCart() {
		return cart;
	}

	public void setCart(CCart cart) {
		this.cart = cart;
	}

	public long getData() {
		return data;
	}

	public void setData(long data) {
		this.data = data;
	}
}

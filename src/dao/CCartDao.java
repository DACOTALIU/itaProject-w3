package dao;

import java.util.List;

import po.CCart;

public interface CCartDao {
	public int addCCart(CCart cart);
	public void updateCCart(CCart cart);
	public List<CCart> listCCart();
	public int deleteCart(int cId);
}

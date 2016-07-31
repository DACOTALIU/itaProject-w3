package service;

import java.util.List;

import po.CCart;
import po.cDishes;

public interface CCartManager {
	public int addCCartManager(CCart cart);
	public int updateCCartManager(CCart cart);
	public int deleteCCartManager(int cId);
	public List<CCart> listCCart();
}

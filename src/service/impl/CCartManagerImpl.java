package service.impl;

import java.util.List;

import dao.CCartDao;
import dao.impl.CCartDaoImpl;
import po.CCart;
import po.cDishes;
import service.CCartManager;

public class CCartManagerImpl implements CCartManager {
	CCartDao cCartdao = new CCartDaoImpl();

	@Override
	public int addCCartManager(CCart cart) {
		// TODO Auto-generated method stub
		cCartdao.addCCart(cart);
		//is the cart.getdishes() json;
		
		return 1;
	}

	@Override
	public int updateCCartManager(CCart cart) {
		// TODO Auto-generated method stub
		cCartdao.updateCCart(cart);
		return 1;
	}

	@Override
	public int deleteCCartManager(int cId) {
		// TODO Auto-generated method stub
		cCartdao.deleteCart(cId);
		return 1;
	}

	@Override
	public List<CCart> listCCart() {
		// TODO Auto-generated method stub
		cCartdao.listCCart();
		return null;
	}




}

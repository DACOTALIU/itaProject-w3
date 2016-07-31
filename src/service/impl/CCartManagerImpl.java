package service.impl;

import dao.CCartDao;
import dao.impl.CCartDaoImpl;
import po.CCart;
import service.CCartManager;

public class CCartManagerImpl implements CCartManager {
	CCartDao cCartdao = new CCartDaoImpl();

	@Override
	public int addCCartManager(CCart cart) {
		// TODO Auto-generated method stub
		cCartdao.addCCart(cart);
		//is the cart.getdishes() json;
		
		return 0;
	}

}

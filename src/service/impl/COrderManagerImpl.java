package service.impl;

import java.util.List;

import dao.COrderDao;
import dao.impl.COrderDaoImpl;
import po.COrder;
import service.COrderManager;

public class COrderManagerImpl implements COrderManager {
COrderDao cOrderDao=new COrderDaoImpl();
	@Override
	public int addCOrder(COrder cOrder) {
		// TODO Auto-generated method stub
		cOrderDao.addCOrder(cOrder);
		return 0;
	}

	@Override
	public List<COrder> listOrder() {
		// TODO Auto-generated method stub
		cOrderDao.listOrder();
		return null;
	}

}

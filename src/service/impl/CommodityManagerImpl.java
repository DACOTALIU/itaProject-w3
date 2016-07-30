package service.impl;

import java.util.List;

import dao.CommodityDao;
import dao.impl.CommodityDaoImpl;
import po.Commodity;
import service.CommodityManager;

public class CommodityManagerImpl implements CommodityManager {
	private CommodityDao bd=new CommodityDaoImpl();
	

	@Override
	public int addBook(Commodity b) {
		return bd.addCommodity(b);
	}

	@Override
	public List<Commodity> findAllBooks() {
		return bd.showAllCommodities();
	}

	@Override
	public int deletBook(int id) {
		return bd.deleteCommodity(id);
	}

}

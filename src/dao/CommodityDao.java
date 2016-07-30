package dao;

import java.util.List;

import po.Commodity;

public interface CommodityDao {
	public int addCommodity(Commodity b);
	public List<Commodity> showAllCommodities();
	public int deleteCommodity(int id);
	
}

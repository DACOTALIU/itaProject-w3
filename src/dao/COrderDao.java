package dao;

import java.util.List;

import po.COrder;

public interface COrderDao {
	public int addCOrder(COrder cOrder);
	public List<COrderDao> listOrder();
}

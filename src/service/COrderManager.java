package service;

import java.util.List;

import po.COrder;

public interface COrderManager {
	public int addCOrder(COrder cOrder);
	List<COrder> listOrder();
}

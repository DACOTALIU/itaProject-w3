package service;

import java.util.List;

import po.Commodity;

public interface CommodityManager {
	public int addBook(Commodity b);
	public List<Commodity> findAllBooks();
	public int deletBook(int id);
	
}

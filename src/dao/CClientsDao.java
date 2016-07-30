package dao;

import java.util.List;

import po.CClient;

public interface CClientsDao {
	public int addCClient (String cUsername,String cPassword);
	public List<CClient> listCClients();
	public List<CClient> listCClientsStartWith(String cUsername);
}

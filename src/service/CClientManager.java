package service;

import java.util.List;

import po.CClient;

public interface CClientManager {
	public int addCClient(String cUsername,String cPassword);
	public int checkPwd(String cUsername,String cPassword);
	public List<CClient> listCClientsStartWith(String cUsernameFisrt);
}

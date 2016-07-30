package service.impl;

import java.util.List;

import dao.CClientsDao;
import dao.impl.CClientsDaoImpl;
import po.CClient;
import service.CClientManager;

public class CClientManagerImpl implements CClientManager {
	CClientsDao cClientDao = new CClientsDaoImpl();

	@Override
	public int addCClient(String cUsername, String cPassword) {
		// TODO Auto-generated method stub
		cClientDao.addCClient(cUsername, cPassword);
		return 1;
	}

	@Override
	public int checkPwd(String Username, String Password) {
		// TODO Auto-generated method stub
		List<CClient> cClients = cClientDao.listCClients();
		for (CClient cClient : cClients) {
			if (cClient.getcUsername().equals(Username) && cClient.getcPassword().equals(Password)) {
				System.out.println("custom information is allow");
				return 1;
			}
		}

		System.out.println("wrong information");
		return 0;
	}

	@Override
	public List<CClient> listCClientsStartWith(String cUsernameFisrt) {
		return null;
	}

	public int checkUserExist(String Username) {
		List<CClient> cClients = cClientDao.listCClients();
		for (CClient cClient : cClients) {
			if (cClient.getcUsername().equals(Username)) {
				System.out.println("The username is exist.");
				return 0;
			}

		}
		System.out.println("The username can be use.");
		return 1;
	}
}

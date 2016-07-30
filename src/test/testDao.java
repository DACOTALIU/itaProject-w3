package test;

import org.junit.Test;

import po.CClient;
import java.util.List;
import dao.CClientsDao;
import dao.impl.CClientsDaoImpl;

public class testDao {

	CClientsDao cDao = new CClientsDaoImpl();

	@Test
	public void testAddCClients() {
		cDao.addCClient("amliy", "123");
	}

	@Test
	public void testListCClients() {
		List<CClient> cClients = cDao.listCClients();
		for (CClient cClient : cClients) {
			System.out.println(cClient.cUsername);
		}
	}

	@Test
	public void listCClientsStartWith() {
		List<CClient> cClients = cDao.listCClientsStartWith("a");
		for (CClient cClient : cClients) {
			System.out.println(cClient.cUsername);
		}

	}

}

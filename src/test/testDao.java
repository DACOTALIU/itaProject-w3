package test;

import org.junit.Test;

import po.CCart;
import po.CClient;
import java.util.List;

import dao.CCartDao;
import dao.CClientsDao;
import dao.impl.CCartDaoImpl;
import dao.impl.CClientsDaoImpl;

public class testDao {

	CClientsDao cDao = new CClientsDaoImpl();
	CCartDao cartDao=new CCartDaoImpl();
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
	@Test
	public void addCCart() {
		CCart cart=new CCart(4,"abc");
		cartDao.addCCart(cart);
		assert(cartDao.addCCart(cart)!=0);
		}

	}



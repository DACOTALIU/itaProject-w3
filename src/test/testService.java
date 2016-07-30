package test;

import static org.junit.Assert.*;

import org.junit.Test;

import service.CClientManager;
import service.impl.CClientManagerImpl;

public class testService {
CClientManager cManager=new CClientManagerImpl();
	@Test
	public void checkPwd() {
		cManager.checkPwd("amy", "123");
	}

}

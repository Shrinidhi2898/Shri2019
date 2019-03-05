package org.service;

import org.DAO.CusDAO;
import org.DAO.CusDaoImpl;
import org.det.Customer;

public class CusServiceImpl implements CusService {
	
	CusDAO dao = new CusDaoImpl();

	@Override
	public Boolean Insert(Customer c) {
		Boolean res = dao.Insert(c);
		
		return res;
	}

	
	

}

package org.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;


import org.det.Customer;
import org.util.DBConst;
import org.util.DBUtil;

public class CusDaoImpl implements CusDAO {

	@Override
	public Boolean Insert(Customer c) {
		Connection conn = null;
		PreparedStatement pst = null;
		Boolean res = false;
		try {
			
			conn = DBUtil.getConnection(DBConst.DRIVER, DBConst.URL, DBConst.UNAME,DBConst.PWD);
			pst = conn.prepareStatement("insert into put_for_sales values(?,?,?,?,?,?,?,?)");
			pst.setInt(1, c.getUserId());
			pst.setString(2, c.getPdtName());
			pst.setString(3, c.getShortDesc());
			pst.setString(4, c.getDetDesc());
			pst.setString(5, c.getCategory());
			pst.setInt(6, c.getPrice());
			pst.setString(7, c.getBid_End_date());
			pst.setString(8,c.getStatus());
			int r = pst.executeUpdate();
			if(r > 0)
				res = true;
			else
				res = false;
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res;
	}
}
	

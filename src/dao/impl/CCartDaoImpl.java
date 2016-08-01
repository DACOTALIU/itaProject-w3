package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import dao.CCartDao;
import po.CCart;
import util.DbUtil;

public class CCartDaoImpl implements CCartDao {

	@Override
	public int addCCart(CCart cart) {
			String sql = "insert into cCart (cId,dishes) values (?,?)";
			Connection con = null;
			PreparedStatement pst = null;
			con = DbUtil.connect();
			int m = 0;
			try {
				pst = con.prepareStatement(sql);
				pst.setInt(1,cart.getcId());
				pst.setString(2, cart.getdishes());
				m = pst.executeUpdate();
				con.commit();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				DbUtil.free(con, pst, null);
			}

			return m;
	}

	@Override
	public void updateCCart(CCart cart) {
		String sql = "update CCart set dishes=? where cId=?";
		Connection con = null;
		PreparedStatement pst = null;
		con = DbUtil.connect();
		int m = 0;
		try {
			pst = con.prepareStatement(sql);
			con.setAutoCommit(false);
			pst.setString(1, cart.getdishes());
			pst.setInt(2, cart.getcId());
			m = pst.executeUpdate();
			con.commit();
		} catch (SQLException e) {
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			DbUtil.free(con, pst, null);
		}
	}

	@Override
	public List<CCart> listCCart() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteCart(int cId) {
		// TODO Auto-generated method stub
		return 0;
	}

}

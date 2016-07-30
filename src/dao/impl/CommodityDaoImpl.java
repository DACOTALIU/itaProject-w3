package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import po.Commodity;
import util.DbUtil;
import dao.CommodityDao;

public class CommodityDaoImpl implements CommodityDao {

	@Override
	public int addCommodity(Commodity b) {
		String sql = "insert into commodities (id,cname,price,backGround) values (book_seq.nextval,?,?,?)";
		Connection con = null;
		PreparedStatement pst = null;
		con = DbUtil.connect();
		int m = 0;
		try {
			pst = con.prepareStatement(sql);
			con.setAutoCommit(false);
			pst.setString(1, b.getCname());
			pst.setDouble(2, b.getPrice());
			pst.setString(3, b.getBackGround());
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

		return m;
	}
	
	@Override
	public int deleteCommodity(int id) {
		String sql = "delete from commodities where id=?";
		Connection con = null;
		PreparedStatement pst = null;
		con = DbUtil.connect();
		int m = 0;
		try {
			pst = con.prepareStatement(sql);
			con.setAutoCommit(false);
			pst.setInt(1, id);
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

		return m;
	}

	

	@Override
	public List<Commodity> showAllCommodities() {
		List<Commodity> cs = new ArrayList<Commodity>();

		String sql = "select * from commodities";
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		con = DbUtil.connect();
		int m = 0;
		try {
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String cname = rs.getString("cname");
				double price = rs.getDouble("price");
				String backGround = rs.getString("backGround");
				int count=rs.getInt("count");
				Commodity b = new Commodity(id,cname,price,backGround,count);
				cs.add(b);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			DbUtil.free(con, pst, null);
		}
		return cs;
	}

	private void Commodity(int id, String cname, double price, String backGround) {
		// TODO Auto-generated method stub
		
	}

	
	
	

}

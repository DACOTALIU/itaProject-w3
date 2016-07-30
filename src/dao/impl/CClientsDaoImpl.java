package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.CClientsDao;
import po.CClient;
import util.DbUtil;

public class CClientsDaoImpl implements CClientsDao {

	@Override
	public int addCClient(String cUsername, String cPassword) {
		String sql = "insert into cClients (cId,cUsername,cPassword) values (cClients_seq.nextval,?,?)";
		Connection con = null;
		PreparedStatement pst = null;
		con = DbUtil.connect();
		int m = 0;
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1,cUsername);
			pst.setString(2, cPassword);
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
	public List<CClient> listCClients() {
		List<CClient> cs = new ArrayList<CClient>();

		String sql = "select * from CClients";
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		con = DbUtil.connect();
		try {
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				int cId = rs.getInt("cId");
				String cUsername = rs.getString("cUsername");
				String cPassword = rs.getString("cPassword");
				CClient client = new CClient(cId,cUsername,cPassword);
				cs.add(client);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			DbUtil.free(con, pst, null);
		}
		return cs;
	}

	@Override
	public List<CClient> listCClientsStartWith(String cUsernameFisrt) {
		List<CClient> cs = new ArrayList<CClient>();
		String sql = "select * from CClients";
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		con = DbUtil.connect();
		try {
			pst = con.prepareStatement(sql);
//			pst.setString(1,startAt.toString());//
			rs = pst.executeQuery();
			while (rs.next()) {
				if(rs.getString("cUsername").startsWith(cUsernameFisrt)){
				int cId = rs.getInt("cId");
				String cUsername = rs.getString("cUsername");
				String cPassword = rs.getString("cPassword");
				CClient cClient  = new CClient(cId, cUsername, cPassword);
				cs.add(cClient);
			}}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			DbUtil.free(con, pst, null);
		}
		return cs;
	}

}

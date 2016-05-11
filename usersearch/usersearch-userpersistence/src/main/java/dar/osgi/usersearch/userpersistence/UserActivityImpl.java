package dar.osgi.usersearch.userpersistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dar.osgi.usersearch.dbconnection.DBConnection;

public class UserActivityImpl implements UserActivity {
	DBConnection connection;
	Connection con;
	PreparedStatement pst;

	@Override
	public boolean login(String userName, String password) {
		return false;
	}

	@Override
	public boolean register(String username, String password) {
		String str="Insert into osgi_user(id,user_name,password) values(?,?,?) ";
		con = connection.createConnection();
		try {
			pst=con.prepareStatement(str);
			pst.setString(3,password);
			pst.setString(2,username);
			pst.setDouble(1,Math.random());
			pst.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}

	public PreparedStatement getPst() {
		return pst;
	}

	public void setPst(PreparedStatement pst) {
		this.pst = pst;
	}

	public void setConnection(DBConnection connection) {
		this.connection = connection;
	}	

}

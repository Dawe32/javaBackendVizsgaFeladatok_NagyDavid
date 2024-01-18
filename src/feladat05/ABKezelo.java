package feladat05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ABKezelo {
	
	private Connection con;
	private String connectionString;
	private String user;
	private String pw;
	
	
	
	public ABKezelo(String connectionString, String user, String pw) {

		this.connectionString = connectionString;
		this.user = user;
		this.pw = pw;
		
	}


	public void csatlakozas() throws SQLException {
		
		try {
			con = DriverManager.getConnection(connectionString,user,pw);
		} catch (Exception e) {
			throw new SQLException("Csatlakozás sikertelen!");
		}
		
	}

	
	public void bontas() throws SQLException {
		
		try {
			con.close();
		} catch (Exception e) {
			throw new SQLException("Kapcsolat bontása sikertelen!");
		}
		
	}

	public List<VasutVonal> vasutLekerdezo() throws SQLException {
		
		List<VasutVonal> vasutVonalak = new ArrayList<VasutVonal>();
		
		PreparedStatement ps=con.prepareStatement("select * from vonal");
		ResultSet res=ps.executeQuery();
		
		while(res.next()) {
			vasutVonalak.add(new VasutVonal(res.getInt("vonalszam"),res.getString("startallomas"),res.getString("celallomas"),
					res.getInt("tavolsag_km"),res.getInt("alapar")));
			
		}
		
		
		
		
		
		
		
		return vasutVonalak;
	}


}

package com.hv.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connectivity {
	public static void main(String[] args) throws SQLException {
		Connection con = null;
		Statement st = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/health_wallet","root","root");
			st = con.createStatement();
			String query = "insert into hwallet values('1','123','Hemant','hemantvinchur96@gmail.com','07/07/1997','Male','O-','7869044206','9039852594','None','None','None','None','None') ";
		
			int i = st.executeUpdate(query);
			if (i!=0) {
				System.out.println(i+" row is successfully inserted");
			}
		} catch (Exception e) {

		e.printStackTrace();
		}finally {
			con.close();
			st.close();
		}
	}


	}
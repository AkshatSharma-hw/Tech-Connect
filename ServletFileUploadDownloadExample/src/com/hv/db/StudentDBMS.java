package com.hv.db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.hv.db.DBMSConnectivity;

public class StudentDBMS {

	public static String addStudent(HealthDTO dto) throws Exception{
		Connection con = null; 
		PreparedStatement st = null;
		String ret="";
		try{
		 con = DBMSConnectivity.getConnection();
		 con.setAutoCommit(false);
		 String query = "insert into hwallet values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		 st = con.prepareStatement(query);
		 st.setString(1, dto.getId());
		 st.setString(2, dto.getPassword());
		 st.setString(3, dto.getUsername());
		 st.setString(4, dto.getEmail());
		 st.setString(5,dto.getDob());
		 st.setString(6, dto.getGender());
		 st.setString(7, dto.getBloodgroup());
		 st.setString(8, dto.getContact());
		 st.setString(9, dto.getE_contact());
		 st.setString(10, dto.getMedication());
		 st.setString(11, dto.getTreatment());
		 st.setString(12, dto.getDisease());
		 st.setString(13, dto.getRare_address());
		 st.setString(14, dto.getNote());
	     int i = st.executeUpdate();
	     if(i!=0){
	    	 System.out.println(i+" record successfully inserted");
	     ret = "succcessfully saved";
	     }else{
	    	 System.out.println("record not inserted");
	     ret = "not saved";
	     }
	     	con.commit();
		}catch(Exception e){
			con.rollback();
			e.printStackTrace();
			ret="exception";
		}finally{
			st.close();
			con.close();
		}
		return ret;
	}
	
	/*public static String getAllStudent() throws Exception{
		Connection con = null; 
		PreparedStatement st = null;
		String ret="";
		HealthDTO dto = new HealthDTO();
		try{
		 con = DBMSConnectivity.getConnection();
	     String query = "insert into feedback (comment) values(?)";
	     st = con.prepareStatement(query);
	     st = con.prepareStatement(query);
	     st.setString(1,dto.getComment());
	     int i = st.executeUpdate();
	     if(i!=0){
	    	 System.out.println(i+" record successfully inserted");
	     ret = "succcessfully saved";
	     }else{
	    	 System.out.println("record not inserted");
	     ret = "not saved";
	     }
	     	con.commit();
	     /*ResultSet rs = st.executeQuery(query);
	     while (rs.next()) {
			FeedBackDTO dto = new FeedBackDTO();
			dto.setName(rs.getString("name"));
			dto.setEmail(rs.getString("email"));
			dto.setComment(rs.getString("comment"));
			dto.setId(rs.getInt("id"));
			dto.setMessage("Successfully saved");
	     list.add(dto);
	     }*/
	     
	     	
		/*}catch(Exception e){
			e.printStackTrace();
			ret="exception";
		}finally{
			st.close();
			con.close();
		}
		return ret;
	}*/

	/*public static HealthDTO getStudentById(HealthDTO dto) throws Exception{
		Connection con = null; 
		Statement st=null;
		String ret="";
		List<HealthDTO> list = new ArrayList<>();
		try{
		 con = DBMSConnectivity.getConnection();
	     st = con.createStatement();
	     String query = "select * from register_tbl1 where student_id="+dto.getId();
	     ResultSet rs = st.executeQuery(query);
	     while (rs.next()) {
			dto.setUsername(rs.getString("name"));
			dto.setEmail(rs.getString("email"));
			dto.setComment(rs.getString("comment"));
			dto.setId(rs.getInt("id"));
	     }
	     	
		}catch(Exception e){
			e.printStackTrace();
			ret="exception";
		}finally{
			st.close();
			con.close();
		}
		return dto;
	}
	
	public static List<HealthDTO> getStudentByName(HealthDTO sdto) throws Exception{
		Connection con = null; 
		Statement st=null;
		String ret="";
		List<HealthDTO> list = new ArrayList<>();
		try{
		 con = DBMSConnectivity.getConnection();
	     st = con.createStatement();
	     String query = "select * from register_tbl1 where name='"+sdto.getUsername().trim()+"'";
	     ResultSet rs = st.executeQuery(query);
	     while (rs.next()) {
	    	 HealthDTO dto = new HealthDTO();
			dto.setUsername(rs.getString("name"));
			dto.setEmail(rs.getString("email"));
			dto.setComment(rs.getString("comment"));
			dto.setId(rs.getInt("id"));
	     list.add(dto);
	     }
	     
	     	
		}catch(Exception e){
			e.printStackTrace();
			ret="exception";
		}finally{
			st.close();
			con.close();
		}
		return list;
	}
	

	public static List<HealthDTO> getStudentByEmail(HealthDTO dto2) throws Exception{
		Connection con = null; 
		Statement st=null;
		String ret="";
		List<HealthDTO> list = new ArrayList<>();
		try{
		 con = DBMSConnectivity.getConnection();
	     st = con.createStatement();
	     String query = "select * from register_tbl1 where email like '%"+dto2.getEmail().trim()+"%'";
	     ResultSet rs = st.executeQuery(query);
	     while (rs.next()) {
	    	 HealthDTO dto = new HealthDTO();
			dto.setUsername(rs.getString("name"));
			dto.setEmail(rs.getString("email"));
			dto.setComment(rs.getString("comment"));
			dto.setId(rs.getInt("id"));
	     list.add(dto);
	     }
	     
	     	
		}catch(Exception e){
			e.printStackTrace();
			ret="exception";
		}finally{
			st.close();
			con.close();
		}
		return list;
	}

	public static String deleteStudentById(HealthDTO dto) throws Exception{
		Connection con = null; 
		Statement st=null;
		String ret="";
		try{
		 con = DBMSConnectivity.getConnection();
	     st = con.createStatement();
	     String query = "delete from register_tbl1 where id = "+dto.getId() ;
	     int i = st.executeUpdate(query);
	     if(i!=0){
	    	 System.out.println(i+" record successfully deleted");
	     ret = "succcessfully deleted";
	     }else{
	    	 System.out.println("record not deleted");
	     ret = "not deleted";
	     }
	     	
		}catch(Exception e){
			e.printStackTrace();
			ret="exception";
		}finally{
			st.close();
			con.close();
		}
		return ret;
	}
	
	public static String updateStudentById(HealthDTO dto) throws Exception{
		Connection con = null; 
		Statement st=null;
		String ret="";
		try{
		 con = DBMSConnectivity.getConnection();
	     st = con.createStatement();
	     String query = "update register_tbl1 set name = '"+dto.getUsername()+"',email='"+dto.getEmail()+"',comment='"+dto.getComment()+"' where id = "+dto.getId() ;
	     int i = st.executeUpdate(query);
	     if(i!=0){
	    	 System.out.println(i+" record successfully updated");
	     ret = "succcessfully updated";
	     }else{
	    	 System.out.println("record not updated");
	     ret = "not updated";
	     }
	     	
		}catch(Exception e){
			e.printStackTrace();
			ret="exception";
		}finally{
			st.close();
			con.close();
		}
		return ret;
	}*/
	
	public static HealthDTO getStudentByIdandPassword(HealthDTO dto) throws Exception{
		Connection con = null; 
		Statement st=null;
		String ret="";
		List<HealthDTO> list = new ArrayList<>();
		try{
		 con = DBMSConnectivity.getConnection();
	     st = con.createStatement();
	     String query = "select * from hwallet where name = '"+dto.getUsername()+"' and password = '"+dto.getPassword()+"'";
	     ResultSet rs = st.executeQuery(query);
	      while(rs.next()) {
			dto.setUsername(rs.getString("name"));
			dto.setPassword(rs.getString("password"));
			dto.setAddress(rs.getString("address"));
			dto.setEmail(rs.getString("email"));
			dto.setContact(rs.getString("contact"));
			dto.setE_contact(rs.getString("e_contact"));
			dto.setMedication(rs.getString("medication"));
			dto.setTreatment(rs.getString("treatement"));
			dto.setDisease(rs.getString("disease"));
			dto.setRare_address(rs.getString("rare_disease"));
			dto.setNote(rs.getString("note"));
			dto.setReport_url(rs.getString("report_url"));
			dto.setType(rs.getString("type"));
			dto.setFrom(rs.getString("from"));
			dto.setDate(rs.getString("date"));
			dto.setId(rs.getString("id"));
			System.out.println("Get data");
			
	     }
	    }catch(Exception e){
			e.printStackTrace();
			
		}finally{
			st.close();
			con.close();
		}
		return dto;
	}

	
}

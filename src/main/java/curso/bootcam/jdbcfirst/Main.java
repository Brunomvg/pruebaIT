package curso.bootcam.jdbcfirst;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		try {
			Connection con=	MyDataSource.getConnection();
			fetchDataTipoBanco(con);
			fetchDataBanco(con);
			traerSucursal(con);
			con.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}


	}
	
	public static void fetchDataTipoBanco(Connection con) throws SQLException {
	    String SQL_QUERY = "select * from TIPO_BANCO";
	    
	    
	    	
	        PreparedStatement pst = con.prepareStatement( SQL_QUERY );
	        ResultSet rs = pst.executeQuery(); 
	            
	            while ( rs.next() ) {
	            	System.out.print(rs.getInt("ID_TIPO")+" ");
	            	
	            	System.out.print(rs.getString("NOMBRE_TIPO"));
	               
	            }
		}
	
	public static void fetchDataBanco(Connection con) throws SQLException {
	    String SQL_QUERY = "select * from BANCO where TIPO_BANCO=1";

	        PreparedStatement pst = con.prepareStatement( SQL_QUERY );
	        ResultSet rs = pst.executeQuery(); 
	            
	            while ( rs.next() ) {
	            	System.out.println(rs.getInt("ID_BANCO"));
	            	
	            	System.out.println(rs.getString("NOMBRE"));
	               
	            }
		}
	
	public static void traerSucursal(Connection con) throws SQLException {
	    String SQL_QUERY = "select * from SUCURSALES";

	        PreparedStatement pst = con.prepareStatement( SQL_QUERY );
	        ResultSet rsSuc = pst.executeQuery(); 
	            
	            while ( rsSuc.next() ) {
	            	System.out.println(rsSuc.getInt("ID_SUCURSAL"));
	            	
	            	System.out.println(rsSuc.getString("NOMBRE_SUC"));
	            	
	            	System.out.println(rsSuc.getString("ID_BANCO"));
	               
	            }
		}


}

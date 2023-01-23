package curso.bootcam.jdbcfirst;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import curso.bootcam.jdbcfirst.model.TipoBanco;

public class InsertMain {
	private static Connection conn;

	public static void main(String[] args) {
		InsertMain insertMain = new InsertMain();

		TipoBanco tb = new TipoBanco(4L, "CAUCION");

		String sql = "INSERT INTO TIPO_BANCO VALUES(" + tb.getIdTipo() + ",'" + tb.getNombreTipo() + "')";
		try {
			conn = MyDataSource.getConnection();
			insertMain.insertData(sql);
			conn.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());

		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		String sql2 = "update banco set nombre ='ICBC' where id_banco = 3";

		try {
			conn = MyDataSource.getConnection();
			insertMain.updatetData(sql2);
			conn.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());

		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		String sql3 = "select * from banco";

		try {
			conn = MyDataSource.getConnection();
			insertMain.readData(sql3);
			conn.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());

		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		String sql4 = "delete from SUCURSALES  where id_banco = 3";

		try {
			conn = MyDataSource.getConnection();
			insertMain.deleteSuc(sql4);
			conn.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());

		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		String sql5 = "select * from sucursales";

		try {
			conn = MyDataSource.getConnection();
			insertMain.readSuc(sql5);
			conn.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());

		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	public void insertData(String sql) throws SQLException {

		PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

		int affectedRows = pstmt.executeUpdate();
		// check the affected rows
		if (affectedRows > 0) {
			// get the ID back
			try (ResultSet rs = pstmt.getGeneratedKeys()) {
				if (rs.next()) {
					System.out.println(rs.getLong(1));
				}
			} catch (SQLException ex) {
				System.out.println(ex.getMessage());
			}
		}

	}

	public void updatetData(String sql2) throws SQLException {

		Statement stmt = conn.createStatement();
		stmt.executeUpdate(sql2);

	}

	public void readData(String sql3) throws SQLException {


		PreparedStatement pst = conn.prepareStatement(sql3);
		ResultSet rsSuc = pst.executeQuery();

		while (rsSuc.next()) {
			System.out.print(rsSuc.getInt("ID_BANCO"));
			System.out.println(rsSuc.getString("NOMBRE"));

		}
	}
	
	public void deleteSuc(String sql4) throws SQLException {

		Statement stmt = conn.createStatement();
		stmt.executeUpdate(sql4);

	}
	

	public void readSuc(String sql5) throws SQLException {


		PreparedStatement pst = conn.prepareStatement(sql5);
		ResultSet rsSuc = pst.executeQuery();

		while (rsSuc.next()) {
			System.out.print(rsSuc.getInt("ID_SUCURSAL"));
			System.out.println(rsSuc.getString("NOMBRE_SUC"));

		}
	}
	

}

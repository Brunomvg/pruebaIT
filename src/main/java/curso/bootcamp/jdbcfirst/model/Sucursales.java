package curso.bootcamp.jdbcfirst.model;

public class Sucursales {
	
	private int ID_SUCURSAL;
	private String NOMBRE_SUC;
	private int ID_BANCO;
	
	
	
	public Sucursales(int iD_SUCURSAL, String nOMBRE_SUC, int iD_BANCO) {
		super();
		ID_SUCURSAL = iD_SUCURSAL;
		NOMBRE_SUC = nOMBRE_SUC;
		ID_BANCO = iD_BANCO;
	}
	
	public int getID_SUCURSAL() {
		return ID_SUCURSAL;
	}
	public void setID_SUCURSAL(int iD_SUCURSAL) {
		ID_SUCURSAL = iD_SUCURSAL;
	}
	public String getNOMBRE_SUC() {
		return NOMBRE_SUC;
	}
	public void setNOMBRE_SUC(String nOMBRE_SUC) {
		NOMBRE_SUC = nOMBRE_SUC;
	}
	public int getID_BANCO() {
		return ID_BANCO;
	}
	public void setID_BANCO(int iD_BANCO) {
		ID_BANCO = iD_BANCO;
	}
	
	

}

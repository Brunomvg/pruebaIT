package curso.bootcamp.jdbcfirst.model;

public class Banco {
	
	
	private int ID_BANCO;
	private String NOMBRE;
	private int TIPO_BANCO;
	
	
	
	public Banco(int iD_BANCO, String nOMBRE, int tIPO_BANCO) {
		super();
		ID_BANCO = iD_BANCO;
		NOMBRE = nOMBRE;
		TIPO_BANCO = tIPO_BANCO;
	}
	
	public int getID_BANCO() {
		return ID_BANCO;
	}
	public void setID_BANCO(int iD_BANCO) {
		ID_BANCO = iD_BANCO;
	}
	public String getNOMBRE() {
		return NOMBRE;
	}
	public void setNOMBRE(String nOMBRE) {
		NOMBRE = nOMBRE;
	}
	public int getTIPO_BANCO() {
		return TIPO_BANCO;
	}
	public void setTIPO_BANCO(int tIPO_BANCO) {
		TIPO_BANCO = tIPO_BANCO;
	}
	
	
	

}

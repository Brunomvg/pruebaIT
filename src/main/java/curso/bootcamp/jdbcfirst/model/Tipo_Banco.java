package curso.bootcamp.jdbcfirst.model;

public class Tipo_Banco {
	
	private long ID_TIPO;
	private String NOMBRE_TIPO;


	
	
	public Tipo_Banco(long iD_TIPO, String nOMBRE_TIPO) {
		super();
		ID_TIPO = iD_TIPO;
		NOMBRE_TIPO = nOMBRE_TIPO;
	}
	public long getID_TIPO() {
		return ID_TIPO;
	}
	public void setID_TIPO(int iD_TIPO) {
		ID_TIPO = iD_TIPO;
	}
	public String getNOMBRE_TIPO() {
		return NOMBRE_TIPO;
	}
	public void setNOMBRE_TIPO(String nOMBRE_TIPO) {
		NOMBRE_TIPO = nOMBRE_TIPO;
	}
	
	
	

}

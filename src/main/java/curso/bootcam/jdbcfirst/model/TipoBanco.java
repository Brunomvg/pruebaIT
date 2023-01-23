package curso.bootcam.jdbcfirst.model;

public class TipoBanco {
	
	private long idTipo;
	private String nombreTipo;
	
	

	
	

	public TipoBanco(long idTipo, String nombreTipo) {
		super();
		this.idTipo = idTipo;
		this.nombreTipo = nombreTipo;
	}



	public long getIdTipo() {
		return idTipo;
	}



	public void setIdTipo(long idTipo) {
		this.idTipo = idTipo;
	}



	public String getNombreTipo() {
		return nombreTipo;
	}
	public void setNombreTipo(String nombreTipo) {
		this.nombreTipo = nombreTipo;
	}
	


}

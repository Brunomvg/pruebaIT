package curso.bootcam.jdbcfirst.model;

public class Banco {
	
	private long idBanco;
	private String nombreBanco;
	private long idTipo;
	
	
	
	public Banco(String nombreBanco, long idTipo) {
		super();
		this.nombreBanco = nombreBanco;
		this.idTipo = idTipo;
	}
	
	
	public long getIdBanco() {
		return idBanco;
	}
	public void setIdBanco(long idBanco) {
		this.idBanco = idBanco;
	}
	public String getNombreBanco() {
		return nombreBanco;
	}
	public void setNombreBanco(String nombreBanco) {
		this.nombreBanco = nombreBanco;
	}
	public long getIdTipo() {
		return idTipo;
	}
	public void setIdTipo(long idTipo) {
		this.idTipo = idTipo;
	}
	

	
	

}

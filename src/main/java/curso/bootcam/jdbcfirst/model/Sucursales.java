package curso.bootcam.jdbcfirst.model;

public class Sucursales {
	
	private long idSuc;
	private String nombreSuc;
	private long idBanco;
	
	
	
	public Sucursales(String nombreSuc, long idBanco) {
		super();
		this.nombreSuc = nombreSuc;
		this.idBanco = idBanco;
	}
	
	
	public long getIdSuc() {
		return idSuc;
	}
	public void setIdSuc(long idSuc) {
		this.idSuc = idSuc;
	}
	public String getNombreSuc() {
		return nombreSuc;
	}
	public void setNombreSuc(String nombreSuc) {
		this.nombreSuc = nombreSuc;
	}
	public long getIdBanco() {
		return idBanco;
	}
	public void setIdBanco(long idBanco) {
		this.idBanco = idBanco;
	}
	

	
	

}

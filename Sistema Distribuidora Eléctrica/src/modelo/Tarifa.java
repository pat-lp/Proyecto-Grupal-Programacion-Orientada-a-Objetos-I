package modelo;

public  class Tarifa {

	protected String servicio;
	
	
	public Tarifa( String servicio) {
		super();
		this.servicio = servicio;
	}
	
	public String getServicio() {
		return servicio;
	}
	public void setServicio(String servicio) {
		this.servicio = servicio;
	}

	@Override
	public String toString() {
		return "Tarifa [servicio=" + servicio + "]";
	}

	
	
	
	


	
	
	
	
}

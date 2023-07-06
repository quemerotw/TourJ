package tours;

public class Lugar {
	
	private String nombre;
	private String ubicacion;
	private double costoPorPersona;
	
	public Lugar(String nombre,String ubicacion,double costo) {
		this.setCosto(costo);
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}

	public double getCosto() {
		return costoPorPersona;
	}

	public void setCosto(double costo) {
		this.costoPorPersona = costo;
	}

	public String getNombre() {
		return nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}
	
}

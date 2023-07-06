package personas;

public class Cliente extends Persona {

	//TODO[CORRECCION] Esto no es un atributo del pasajero
	private int numeroToursRealizados;	//cantidad de tours realizados por cada individuo
	
	//TODO[CORRECCION] para que queremos esto?
	private static int cantidadPasajeros;  //numero de pasajeros creados
	
	
	public Cliente(tipoDocumento tipo_documento,int nDocumento) {
		super(tipo_documento,nDocumento);
		this.numeroToursRealizados = 0;
		cantidadPasajeros++;
	}
	public Cliente(String apellido, String nombre, int edad, tipoDocumento tipo_documento, int nDocumento) {
		super(apellido, nombre,edad, tipo_documento, nDocumento);
		this.numeroToursRealizados = 0;
		cantidadPasajeros++;
	}
	public int getNumeroToursRealizados() {
		return numeroToursRealizados;
	}
	public static int getCantidadPasajeros() {
		return cantidadPasajeros;
	}

	


		

	
	
		
}

package personas;

public abstract class Persona {
	
	
	private String nombre;
	private String apellido;
	//TODO[CORRECCION] utilizarNotacionCamelParaNombreDeAtributosSinGuionesBajos
	private tipoDocumento tipoDocumento; //obligatorio
	private int edad;
	
	//TODO[CORRECCION] utilizar nombres completos: numero, numeroDocumento, etc
	private int nDocumento; //obligatorio
	
	
	
	public Persona(tipoDocumento tipo_documento,int nDocumento) {
		this("nombre","apellido",20,tipo_documento,nDocumento);
	}
	
	
	public Persona(String nombre,String apellido,int edad,tipoDocumento tipoDocumento,int nDocumento) {
		this.apellido=apellido;
		this.nombre=nombre;
		this.edad=edad;
		this.nDocumento=nDocumento;
		this.tipoDocumento=tipoDocumento;
	}
	

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Persona) {
			Persona x = (Persona)obj;
			return (this.nDocumento == x.getnDocumento());
		}
		else {
			return false;
		}
	}



	@Override
	public String toString() {
		return String.format("Nombre: %s - Apellido: %s - Edad %d- Tipo de documento %s N° %d -", this.nombre,this.apellido,this.edad,this.tipoDocumento.name(),this.nDocumento);
	}



	public int getnDocumento() {
		return nDocumento;
	}



	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}



	public tipoDocumento getTipo_documento() {
		return tipoDocumento;
	}
	
}

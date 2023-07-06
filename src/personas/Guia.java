package personas;



public class Guia extends Persona{

	private String cuil;
	private String fechaIngreso;
	private int nMatricula;
	
	public Guia(String nombre,
			String apellido, 
			int edad, 
			tipoDocumento tipo_documento, 
			int nDocumento,  
			int nMatricula,
			String fechaIngreso,
			String cuil) {
		super(nombre, apellido, edad, tipo_documento, nDocumento);
		this.cuil=cuil;
		this.fechaIngreso = fechaIngreso;
		this.nMatricula=nMatricula;
	}
	public Guia(tipoDocumento tipo_documento, int nDocumento) {
		super(tipo_documento, nDocumento);
		this.cuil = String.format("20-%d-5", nDocumento);
		this.nMatricula = 0;
		this.fechaIngreso = "10-10-2000";
	}
	
	
	
	
	
	@Override
	public String toString() {
		return String.format("Guia Matricula n° %d - %s",this.nMatricula,super.toString());
	}
	public String getCuil() {
		return cuil;
	}
	public void setCuil(String cuil) {
		this.cuil = cuil;
	}
	public String getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public int getnMatricula() {
		return nMatricula;
	}
	public void setnMatricula(int nMatricula) {
		this.nMatricula = nMatricula;
	}
	
	

}
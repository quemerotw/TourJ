package tours;

import personas.*;

public class Tourinfantiles extends Tour {

	
	private Cliente padreResponsable;


	public Tourinfantiles(Cliente[] pasajeros, Guia[] guias, Lugar[] lugares,Cliente padreResponsable) {
		super(pasajeros, guias, lugares);
		this.setPadreResponsable(padreResponsable);
	}
	
	

	@Override
	public void listarDetalles() {
		System.out.println("Tour Infantiles");
		super.listarDetalles();
		System.out.println(String.format("Datos Padre Responsable: %s \nPrecio Total con descuento: $%.2f",padreResponsable.toString(),this.calculoCosto()));
	}



	public Cliente getPadreResponsable() {
		return padreResponsable;
	}

	public void setPadreResponsable(Cliente padreResponsable) {
		this.padreResponsable = padreResponsable;
	}
	
	
	
	//TODO[CORRECCION] falta calculo de costo
	public double calculoCosto() {
		double descuento= 0;
		if (this.getPasajeros().length > 10) {
			descuento = (super.calculoCosto()/100) * 5;
		}
		else {
			descuento = 0;
		}
		return super.calculoCosto() - descuento;
	}
	
	
}



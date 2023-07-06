package tours;

import personas.*;


public class Tourjubilado extends Tour{
	
	
	public Tourjubilado(Cliente[] pasajeros, Guia[] guias, Lugar[] lugares) {
		super(pasajeros, guias, lugares);
	}


	@Override
	public void listarDetalles() {
		System.out.println("Tour Jubilados");
		super.listarDetalles();
	}


	public double calculoCosto() {
		return super.calculoCosto() + ((super.calculoCosto()/100) * 3);
	}
	
	//TODO[CORRECCION] falta calculo de costo
}

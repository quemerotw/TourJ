package tours;

import personas.*;
import java.time.LocalDate;

public class Tour {
	
	private Cliente[] pasajeros;
	//TODO[CORRECCION] utilizarNotacionCamel
	private String codUnicoCorrelativo;
	private LocalDate fecha;
	//TODO[CORRECCION] deberia ser una lista de lugares
	private Lugar[] lugares;
	private static int numTour = 1;
	private Guia[] guias;
	//TODO[CORRECCION] no utilizar variables para mantener algo que se calcula
	//private double costoTotal;
	
	
	public Tour(Cliente[] pasajeros,Guia[] guias,Lugar lugares[]) {
		this.pasajeros = pasajeros;
		this.fecha = LocalDate.now();
		this.codUnicoCorrelativo = String.format("N%d-P%d-F%s",numTour,pasajeros.length,fecha); // el codigo se compone de :"lugar"-"numero de tour"-"cantidad de pasajeros","fecha del tour"
		this.lugares = lugares;
		this.guias=guias;
		numTour++;
	}

	public void listarDetalles() {
		System.out.println(String.format("Codigo Tour: %s , Costo Total : $ %.2f",this.codUnicoCorrelativo,this.calculoCosto()));
		for (Guia guiaAux : this.guias) {
			System.out.println(guiaAux.toString());
		}
		for (Cliente pasajeroAux : this.pasajeros) {
			System.out.println(pasajeroAux.toString());
		}
		String nombreLugares="";
		for (Lugar lugarAux : this.lugares) {
			nombreLugares = nombreLugares + "-" + lugarAux.getNombre();
		}
		System.out.println("Recorrido :" + nombreLugares);
	}
	
	
	
	
	public Guia[] getGuias() {
		return guias;
	}

	public Cliente[] getPasajeros() {
		return pasajeros;
	}

	public String getCod_unico_correlativo() {
		return codUnicoCorrelativo;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public Lugar[] getLugares() {
		return lugares;
	}

	
	//TODO[CORRECCION] falta calculo de costo
	public double calculoCosto() {
		double costoEntradas = 0; 
		for (Lugar lugarAux : this.lugares) {
			costoEntradas = costoEntradas + (pasajeros.length * lugarAux.getCosto());
		}
		double ganancia = (costoEntradas/100)*15;
		return costoEntradas + ganancia;
	}
	
}

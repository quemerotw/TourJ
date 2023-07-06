package prueba;


import personas.*;
import tours.*;

public class Prueba {

	public Prueba() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// instanciacion de pasajeros
		Cliente pasajero1 = new Cliente("Josefa","Carlone",20,tipoDocumento.DNI,32987561);
		Cliente pasajero2 = new Cliente("Pancracio","Delopi",32,tipoDocumento.DNI,22590987);
		Cliente pasajero3 = new Cliente("Estebean","Quito",24,tipoDocumento.DNI,38745322);
		Cliente pasajero4 = new Cliente("Paquita","Ladelbarrio",72,tipoDocumento.LE,15590987);
		Cliente pasajero5 = new Cliente("Juana","Delgolpe",36,tipoDocumento.DNI,36590987);
		Cliente pasajero6 = new Cliente("Oscar","Malavida",20,tipoDocumento.DNI,38590987);
		Cliente pasajero7 = new Cliente("Keli","Narks",10,tipoDocumento.PASS,34590987);
		Cliente pasajero8 = new Cliente("Facundo","Nero",10,tipoDocumento.DNI,335650987);
		Cliente pasajero9 = new Cliente("Pablo","Ojeda",87,tipoDocumento.DNI,39590987);
		Cliente pasajero10 = new Cliente("Pablo","Ojeda",20,tipoDocumento.DNI,30590987);
		Cliente pasajero11 = new Cliente("Ojeda","Pablo",20,tipoDocumento.DNI,30590987);

		
		Cliente[] contingente1 = new Cliente[] {pasajero1,pasajero2,pasajero5,pasajero6};
		Cliente[] contingente2 = new Cliente[] {pasajero3,pasajero7,pasajero10,pasajero11,pasajero2,pasajero4};
		Cliente[] contingenteMayores = new Cliente[] {pasajero4,pasajero9};
		Cliente[] contingenteMenores = new Cliente[] {pasajero7,pasajero8};
		
		
		//instanciacion de lugares
		Lugar plazaCentenario = new Lugar("Plaza Centenario","mitre y 25 de mayo",10.0);
		Lugar rioChubut = new Lugar("Costa Rio Chubut","Cacique Nauelpan 4500",20.0);
		Lugar mef = new Lugar("Museo Paleontologico","Fontana 50",120.0);
		
		// constructor guia 1(incompleto)
		Guia guia1 = new Guia(tipoDocumento.DNI,40341212);
		guia1.setNombre("Juan");
		guia1.setApellido("Moreira");
		guia1.setEdad(30);
		guia1.setnMatricula(30560);
		guia1.setCuil("20-40341212-5");
		
		//constructor guia 2 (completo)
		Guia guia2 = new Guia("Romina","Joanes",23,tipoDocumento.DNI,40341262,2732,"17-4-2013","20-40341212-5");
		Guia[] equipo1 = new Guia[] {guia1};
		Guia[] equipo2 = new Guia[] {guia1,guia2};
		
		//instanciacion de tours
		Lugar[] recorrido1 = new Lugar[] {plazaCentenario,mef,rioChubut};
		Lugar[] recorrido2 = new Lugar[] {mef,rioChubut};
		
		Tour tour1 = new Tour(contingente1,equipo1,recorrido1);
		Tour tour2 = new Tour(contingente2,equipo1,recorrido2);
		Tourinfantiles tourInfantiles = new Tourinfantiles(contingenteMenores,equipo1,recorrido1,pasajero11);
		Tourjubilado tourJubilados = new Tourjubilado(contingenteMayores,equipo2,recorrido2);
		
		//listado de detalles
		tour1.listarDetalles();
		System.out.println("\n--------------------------------------------------\n");
		tour2.listarDetalles();
		System.out.println("\n--------------------------------------------------\n");
		tourInfantiles.listarDetalles();
		System.out.println("\n--------------------------------------------------\n");
		tourJubilados.listarDetalles();
		System.out.println("\n--------------------------------------------------\n");
	}

}
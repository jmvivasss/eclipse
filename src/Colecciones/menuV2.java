package Colecciones;

import java.util.Scanner;
import java.util.LinkedHashSet;

public class menuV2 {
	
static Scanner Sc = new Scanner(System.in);
	
	public static void mostrarMenu() {
		System.out.println("Menú ");
		System.out.println("1-Añadir fruta a la cesta");
		System.out.println("2-Editar la cesta");
		System.out.println("3-Borrar una fruta de la cesta");
		System.out.println("4-Reiniciar la cesta");
		System.out.println("5-Añadir a la cesta una fruta de cada");
		System.out.println("6-Imprimir cesta y continuar");
		System.out.println("7-Pasar por caja");

	}
	
	
	public static void opciones(int opcion, LinkedHashSet<fruta> f) {
		switch (opcion) {
		case 1:UnidadesFrutas(f);break;
		case 2:EditarCesta(f);break;	
		case 3:EliminarFrutaConcreta(f);break;
		case 4:ReiniciarCesta(f);break;
		case 5:UnaDeCada(f);break;
		case 6:imprimirTicket(f);break;
		case 7:imprimirTicket(f);System.out.println("\n\nEl programa ha finalizado");break;
		default:System.out.println("error");
		}
	}
	
	
	public static void InicializarFrutas(LinkedHashSet<fruta> f) { 
		fruta fruta1 = new fruta("Manzana", 0.2);
		fruta fruta2 = new fruta("Pera", 0.15);
		fruta fruta3 = new fruta("Platano", 0.2);
		fruta fruta4 = new fruta("Mango", 0.35);
		  
		f.add(fruta1);  
		f.add(fruta2);
		f.add(fruta3);
		f.add(fruta4);
	}
	
	public static void UnidadesFrutas(LinkedHashSet<fruta> f ) {
		int cual;
		listaFrutas();
		cual = Sc.nextInt();
		
		int cuantas=0;
		System.out.println("¿Cuánta      s quieres?");
		cuantas = Sc.nextInt();
		
		fruta[] arrayDeFrutas = f.toArray(new fruta[0]);
		if (arrayDeFrutas.length > 0) {
			arrayDeFrutas[cual].setUnidades(arrayDeFrutas[cual].getUnidades()+cuantas);
		}
	} 
	
	public static void EliminarFrutaConcreta(LinkedHashSet<fruta> f) {
		int cual=0;
		System.out.println("¿Cuál es la fruta que quieres eliminar de la cesta?");
		listaFrutas();
		cual = Sc.nextInt();
		
		fruta[] arrayDeFrutas = f.toArray(new fruta[0]);
		
		if(cual==1) {arrayDeFrutas[0].setUnidades(0);}
		else if(cual==2) {arrayDeFrutas[1].setUnidades(0);}
		else if(cual==3) {arrayDeFrutas[2].setUnidades(0);}
		else if(cual==4) {arrayDeFrutas[3].setUnidades(0);}
		
	}
	
	
	public static void ReiniciarCesta (LinkedHashSet<fruta> f) {
		fruta[] arrayDeFrutas = f.toArray(new fruta[0]);
		arrayDeFrutas[0].setUnidades(0);
		arrayDeFrutas[1].setUnidades(0);
		arrayDeFrutas[2].setUnidades(0);
		arrayDeFrutas[3].setUnidades(0);
		
		System.out.println("Cesta reiniciada con exito! ");
	}
	
	public static void EditarCesta (LinkedHashSet<fruta> f) {
		int cual=0;
		int cuantas=0;
		System.out.println("¿Cuál es la fruta que quieres editar de la cesta?");
		listaFrutas();
		cual = Sc.nextInt();
		
		System.out.println("¿Cuántas unidades quieres?");
		cuantas = Sc.nextInt();
		
		fruta[] arrayDeFrutas = f.toArray(new fruta[0]);
		
		if(cual==1) {arrayDeFrutas[0].setUnidades(cuantas);}
		else if(cual==2) {arrayDeFrutas[1].setUnidades(cuantas);}
		else if(cual==3) {arrayDeFrutas[2].setUnidades(cuantas);}
		else if(cual==4) {arrayDeFrutas[3].setUnidades(cuantas);}
		
	}
	
	public static void UnaDeCada (LinkedHashSet<fruta> f) {
		fruta[] arrayDeFrutas = f.toArray(new fruta[0]);
		arrayDeFrutas[0].setUnidades(arrayDeFrutas[0].getUnidades()+1);
		arrayDeFrutas[1].setUnidades(arrayDeFrutas[1].getUnidades()+1);
		arrayDeFrutas[2].setUnidades(arrayDeFrutas[2].getUnidades()+1);
		arrayDeFrutas[3].setUnidades(arrayDeFrutas[3].getUnidades()+1);
		
		System.out.println("Se ha añadido una fruta de cada con exito! ");
	}
	
	public static void imprimirTicket (LinkedHashSet<fruta> f) {
		double tot=0;
		fruta[] arrayDeFrutas = f.toArray(new fruta[0]);
		for (fruta i : arrayDeFrutas) {
		    System.out.println("Fruta: " + i.getNombre() 
		    + " - Unidades: " + i.getUnidades()
		    + " - Precio: " + String.format("%.2f",i.getPrecioTotal()));
		    tot=tot+i.getPrecioTotal();
		}
		System.out.println("El total sin IVA es: "+ String.format("%.2f", tot));       //%.2f es pa q saque solo 2 decimales
		System.out.println("El total con IVA es: "+ String.format("%.2f", tot*1.21));
		System.out.println("(HACIENDA SOMOS TODOS)");
	}
	
	public static void listaFrutas () {
		System.out.println("1-Manzanas");
		System.out.println("2-Peras");
		System.out.println("3-Platanos");
		System.out.println("4-Mangos");
	}

}

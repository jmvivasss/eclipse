package Colecciones;

import java.util.*;


public class UsoFruta {
	
	//Jose Miguel Vivas
	//Este es el codigo de una cesta de frutas
	
	 public static void main(String args[]){  
		 Scanner Sc= new Scanner(System.in);
		 int op=0;
		 
		 LinkedHashSet<fruta> frutas=new LinkedHashSet<fruta>(4);    
		  
		 menuV2.mostrarMenu();
		 menuV2.InicializarFrutas(frutas);
		 
		 
		 while(op!= 10) {
			 System.out.println("");
			 System.out.println("Digame el numero de la opción que desee");
			 op = Sc.nextInt();
			 menuV2.opciones(op, frutas);   
		 }
		 Sc.close();
		  
		}
}

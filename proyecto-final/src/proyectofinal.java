import java.util.Scanner;
public class proyectofinal {

public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	Scanner entrada2 = new Scanner(System.in);
	Scanner entrada3 = new Scanner(System.in);
	Scanner entrada4 = new Scanner(System.in);
	Scanner entrada5 = new Scanner(System.in);
	Scanner entrada6 = new Scanner(System.in);
	
	int op = 0;
	int op2 = 0;
	int op3 = 0;
	int count = 0;
	int clave = 0;
	String nombre;
	String tipo; 
	
	while(op != 9) {
	System.out.println("1) Insertar");
	System.out.println("2) Modificar");
	System.out.println("3) Buscar");
	System.out.println("4) Exportar en preorden");
	System.out.println("5) Exportar en inorden");
	System.out.println("6) Exportar en postorden");
	System.out.println("7) Exportar periodico");
	System.out.println("8) Eliminar");
	System.out.println("9) Salir");
	
	op = entrada.nextInt();
	
	switch(op) {
	case 1:
		if(count == 0) {
			/*BinarySearchTree nuevo = new BinarySearchTree();
			nuevo.insert(id);*/
			System.out.println("Ingresa clave del periodico");
			clave = entrada4.nextInt();
			
			System.out.println("Ingresa nombre del periodico");
			nombre = entrada5.next();
			
			System.out.println("Ingresa tipo de periodico: Online o impreso");
			tipo = entrada6.nextLine();
			
			/*Creacion del periodico genesis*/
			periodico ABB = new periodico<Nodo>(clave, nombre, tipo);
			
			/*Creacion del ABB*/
			Arbol arbolABB = new Arbol(ABB);
			
			
			break;
		}
		
	
		
		break;
	case 2:
	while(op2 != 4 ) {
		System.out.println("1) Nombre del periodico");
		System.out.println("2) Tipo");
		System.out.println("3) Top noticias");
		System.out.println("4) Regresar al menu principal");
		op2 = entrada2.nextInt();
		
		switch(op2) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			while(op3 != 6) {
				System.out.println("1) Insertar por fecha");
				System.out.println("2) Eliminar por fecha");
				System.out.println("3) Modificar");
				System.out.println("4) Mostrat por dia");
				System.out.println("5) Mostrar todos");
				System.out.println("6) Regresar al menu anterior");
				op3 = entrada3.nextInt();
			switch(op3) {
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
			}
			}
			break;
		}
		
	}
		break;
	case 3:
		break;
	case 4:
		break;
	case 5:
		break;
	case 6:
		break;
	case 7:
		break;
	case 8:
		break;
	case 9:
		break;
	}
	
	}
	
}
}

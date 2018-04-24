public class lista {
    Scanner leer=new Scanner(System.in);
	Nodo primero;
	
	public lista(){
		
		primero=null;
		
	}
	
	public void crearlista(){
		
		if(primero==null){
			
                        System.out.print("Nombre: ");
                        String lo=leer.next();
			primero= new Nodo(lo, primero);
		}
	}
	
	public void recorrerlista(){
		
		Nodo n;
		n=primero;
		
		if(n==null){
			System.out.println("No tiene elementos");
		}
		
		else{
			while(n!=null){
                        System.out.println("\n");
			System.out.println(n.dato);
			n=n.referencia;
			}
		}
	}
	
	public void insertarPrimero(){

		Nodo n=primero;
		
		if(n==null){
			System.out.println("No tiene elementos");
		}
		
		else{
			System.out.print("Dame el número :");
			String y=leer.next();
			Nodo nuevo=new Nodo(y);
			nuevo.referencia=n;
			primero=nuevo;
			}
	}
	
	public void insertarUltimo(){
		
		Nodo ultimo=null, n=primero;
		
		if(n==null){
			System.out.println("No tiene elementos");
		}
		
		else{
			while(n!=null){
				ultimo=n;
				n=n.referencia;
			}
			
			System.out.print("Dame el nuevo número :");
			String y=leer.next();
			ultimo.referencia=new Nodo(y);
		}
	}
	
	public void eliminarElemento(){
		
		Nodo n=primero, anterior=null;
		boolean encontrado=false;
		
		if(n==null){
			System.out.println("No tiene elementos");
		}
		
		else{
			System.out.print("Eliminar :");
			Scanner leer=new Scanner(System.in);
			String nnom=leer.next();
			
				while((n!=null)&&(encontrado==false)){
					encontrado=(nnom.equals(n.dato));
			
						if(encontrado==false){
							anterior=n;
							n=n.referencia;
						}
				}
				
				if(n!=null){
					if(n==primero){
						primero=n.referencia;
					}
					else{
						anterior.referencia=n.referencia;
					}
				}
		}
	}

	public void insertarElemento(){
		Nodo ref=null, n=primero;
		boolean encontrado=false;
		Scanner leer=new Scanner(System.in);

		if(n==null){
			System.out.println("No tiene elementos");
		}

		else{
			System.out.print("Insertar un elemento despues del :");
			String x=leer.next();
			
			while(n!=null){
				if(x.equals(n.dato)){
				ref=n;
				encontrado=true;}
				n=n.referencia;
			}
			
			if(encontrado==true){
				System.out.print("Nuevo número :");
				String y=leer.next();
				Nodo nuevo=new Nodo(y);
				nuevo.referencia=ref.referencia;
				ref.referencia=nuevo;
			}
			
			else{
				System.out.println("Elemento no Encontrado");
			}
		}
	}

	public void buscarElemento(){
		Nodo n=primero;
		boolean encontrado=false;

		if(n==null){
			System.out.println("No tiene elementos");
		}

		else{
			System.out.print("Escribe el número :");
			String tw="";
			tw=leer.next();
			
			while(n!=null){
				if(tw.equals(n.dato)){
					System.out.println("Número '"+tw+"' fue encontrado en la posicion :"+n);
					encontrado=true;
				}
				n=n.referencia;
			}
				if(encontrado==false){
					System.out.println("El número :"+tw+" no existe");
				}
		}
	}

	public static void main(String args[]){
		Scanner leer=new Scanner(System.in);
		lista Lista= new lista();
		int opcion=0;
		
		while(opcion!=8){
                        System.out.println("\n");
			System.out.println("1.- Crear una lista enlazada");
			System.out.println("2.- Insertar un número al inicio de la lista");
			System.out.println("3.- Insertar un número al final de la lista");
			System.out.println("4.- Insertar un número entre nodos de la lista");
			System.out.println("5.- Buscar un número en la lista");
			System.out.println("6.- Eliminar un número de la lista.");
			System.out.println("7.- Recorrer la lista");
			System.out.println("8.- Salir");
			System.out.print("Teclea una Opcion : \n");
			opcion=leer.nextInt();
			
			switch(opcion){
				case(1): Lista.crearlista();
				break;
				
				case(2): Lista.insertarPrimero();
				break;
				
				case(3): Lista.insertarUltimo();
				break;
				
				case(4): Lista.insertarElemento();
				break;
				
				case(5): Lista.buscarElemento();
				break;
				
				case(6): Lista.eliminarElemento();
				break;
				
				case(7): Lista.recorrerlista();
				break;
				
			}
		}
	}
}

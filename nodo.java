public class Nodo {
    String dato="";
	Nodo referencia;
	
	public Nodo(String x){
		dato=x;
		referencia=null;
	}
	
	public Nodo(String x, Nodo n){
		dato=x;
		referencia=n;
	}
}

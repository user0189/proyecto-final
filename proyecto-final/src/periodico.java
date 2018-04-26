
public class periodico<T> {
	public int clave;
	public String Nombre;
	public String Tipo;
	public Lista<T> TopNoticias;
	
	public periodico(int c, String n, String t){
		this.clave = c;
		this.Nombre = n;
		this.Tipo = t;
	}
	
	public void modificarNombre(String n) {
		this.Nombre = n;
	}
	
	public void modificarTipo(String t) {
		this.Tipo = t;
	}
	
	
		
}

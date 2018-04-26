import java.util.Date;

class Nodo<T> {
	public Nodo<T> siguiente;
	public Date fecha;
	public String NomPeriodista;
	public String EncabezadoNoticia;

	public Nodo(String Nombre, String Encabezado){
		this.NomPeriodista = Nombre;
		this.EncabezadoNoticia = Encabezado;
		fecha = new Date();
	}

	public void setNext(Nodo<T> sig) {
		this.siguiente = sig;
	}

	public Nodo<T> getNext() {
		return siguiente;
	}


}

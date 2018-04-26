import java.util.Date;

class Nodo<T> {
	public T valor;
	public Nodo<T> siguiente;
	public Date fecha;
	public String NomPeriodista;
	public String EncabezadoNoticia;

	public Nodo(T val, String Nombre, String Encabezado){
		this.valor = val;
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

	public T getValue() {
		return valor;
	}
}
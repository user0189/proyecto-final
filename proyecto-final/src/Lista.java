public class Lista<T> {

	public Nodo<T> first = null;
	
	public void insert(Nodo<T> Nodo) {
		Nodo.setNext(first);
		first = Nodo;
	}


	public void remove(){
		if(first.getNext()!=null)
			first = first.getNext();
		else first = null;
	}
	
	public void printList(Nodo<T> Nodo) {
		System.out.println("Node is " + Nodo.getValue());
		if(Nodo.getNext()!=null) printList(Nodo.getNext());
	}

}
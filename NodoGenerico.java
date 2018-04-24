public class Nodo<T> {
    T dato;
    Nodo  siguiente;
    
    public Nodo(T dato){
        this.dato=dato;
       this.siguiente=null;
    }
    //saber el valor que asignamos
    
    public T obtenerDato(){
        return dato;
    }
    //apuntar a otro nodo
   

    @Override
    public String toString() {
        return  "Dato"+dato;
    }

}

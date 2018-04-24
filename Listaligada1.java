public class ListaLigadaSimple<T> {
    Nodo cabeza;
    int size;
    public ListaLigadaSimple(){
        this.cabeza = null;
        this.size = 0;
    }
    public boolean esVacia(){
        return(cabeza == null)?true:false;
    }
    
    public void addPrimero(T dato){
        if(cabeza==null){
            cabeza= new Nodo(dato);
            //cuando no hay dato en la lsita 
        }else{
           
            Nodo nuevo = new Nodo(dato); // esta solo 
            nuevo.siguiente=cabeza; // en la zar con la cabeza actual
           cabeza=nuevo;
        }
        size++;
    }
    public void addFinal(T dato){
       Nodo nodo = new Nodo(dato);
        if(cabeza==null){
           cabeza=new Nodo(dato);
       }else{
        
        Nodo puntero= cabeza;// para saber la cabeza
        while(puntero.siguiente != null){
        puntero=(Nodo) puntero.siguiente;
        }
        puntero.siguiente=nodo;
        size++;
       }
    }
    public void eliminarInicio(){
        if(cabeza != null){
        Nodo primer=cabeza;
        cabeza=(Nodo) cabeza.siguiente;
        primer.siguiente=null;
        size--;
        }
        
        
    }
    
  public void eliminarUltimo(){
        if(cabeza!= null){
            if(cabeza.siguiente==null){
            cabeza=null;
            }else{
            Nodo puntero=cabeza;
            while(puntero.siguiente.siguiente != null){
                puntero =(Nodo) puntero.siguiente;
            }
            puntero.siguiente=null;
            }
        }
    }
   
    public boolean buscarDato(T dato){ 
        if(cabeza== null){
            System.out.println(false+" lista vacia");
        }
        else{
        Nodo puntero=cabeza;
        int contador=0;
        while(contador < size){
            puntero=(Nodo) puntero.siguiente;
            if(puntero.obtenerDato()==dato){
             return true;
         }
            contador++;
        }       
        }
        return false;
     }
    //para obtener una posicion de la lista
    public T obtener(int index){
       
       if(cabeza== null){
           return null;
       }else{
           Nodo puntero= cabeza;
           int contador=0;
           while(contador < index && puntero.siguiente!=null){
               puntero=(Nodo) puntero.siguiente;
               contador++;
           }
           if(contador != index){
               return null;
           }else{
               return (T) puntero.obtenerDato();
           }
       }
        
    }
    public void imprimirLista(){
             
        for(int i=0;i < size;i++){
            
            System.out.println(obtener(i));
        } 
    }
    
}

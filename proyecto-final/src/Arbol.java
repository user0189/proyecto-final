public class Arbol {
 
    /* Atributos */
    private periodico raiz;
    private periodico hojaIzquierda;
    private periodico hojaDerecha;
 
    /* Contructories */    
    public Arbol( periodico r ) {
        this.raiz = r;
    }

    /* Setters y Getters */
    public periodico getRaiz() {
        return raiz;
    }
 
    public void setRaiz(periodico raiz) {
        this.raiz = raiz;
    }
    
    private void addNodo( periodico nodo, periodico raiz ) {
        /* 2.- Partiendo de la raíz preguntamos: Nodo == null ( o no existe ) ? */
        if ( raiz == null ) {

           
            this.setRaiz(raiz);
        }
        else {
            /* 4.- En caso negativo preguntamos: X < Nodo */
            if ( periodico.clave <= raiz.clave ) {
                /* 
                 * 5.- En caso de ser menor pasamos al Nodo de la IZQUIERDA del
                 * que acabamos de preguntar y repetimos desde el paso 2 
                 * partiendo del Nodo al que acabamos de visitar 
                 */
                if (raiz.getHojaIzquierda() == null) {
                    raiz.setHojaIzquierda(periodico);
                }
                else {
                    addNodo( nodo , raiz.getHojaIzquierda() );
                }
            }
            else {
                /* 
                 * 6.- En caso de ser mayor pasamos al Nodo de la DERECHA y tal
                 * cual hicimos con el caso anterior repetimos desde el paso 2
                 * partiendo de este nuevo Nodo.
                 */
                if (raiz.getHojaDerecha() == null) {
                    raiz.setHojaDerecha(nodo);
                }
                else {
                    addNodo( nodo, raiz.getHojaDerecha() );
                }
            }
        }
    }
 
    public void addNodo( periodico nodo ) {
        this.addNodo( nodo , this.raiz );
    }
    

    public periodico getHojaIzquierda() {
        return hojaIzquierda;
    }
 
    public void setHojaIzquierda(periodico hojaIzquierda) {
        this.hojaIzquierda = hojaIzquierda;
    }
 
    public periodico getHojaDerecha() {
        return hojaDerecha;
    }
 
    public void setHojaDerecha(periodico hojaDerecha) {
        this.hojaDerecha = hojaDerecha;
    }
 
 
}

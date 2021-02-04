
package vectorordenamiento;


public class VectorOrdenamiento {

    
    public static void main(String[] args) {
        /*
        Crear un vector de n elementos para almacenar sueldos de menor a mayor
        */
        
        Ordenar or = new Ordenar();
        
        or.carga();
        or.imprimirDesorden();
        or.ordenarBurbujaMenorMayor();
        or.imprimirBurbujaMenorMayor();
        or.OrdenarBurbujaMayorMenor();
        or.imprimirBurbujaMayorMenor();
    }
    
}

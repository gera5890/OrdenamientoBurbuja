
package vectorordenamiento;

import java.util.Scanner;


public class Ordenar {
    
    private Scanner teclado;
    private int vectorSueldos [];
    private int elementos;
    
    public void carga(){
        teclado =  new Scanner(System.in);
        System.out.println("Digite el numero de elementos del vector");
        elementos = teclado.nextInt();
        vectorSueldos = new int [elementos];
        
        System.out.println("Digite el elemento del vector: ");
        for(int x =0; x < vectorSueldos.length ; x++){
            vectorSueldos[x] = teclado.nextInt();
            
        }
    }
    
    public void imprimirDesorden(){
        for(int x = 0; x < vectorSueldos.length ; x++){
            System.out.print("["+vectorSueldos[x]+"]");
        }
    }
    
    public void ordenarBurbuja(){
        
        for(int x = 0; x < (vectorSueldos.length-1); x++){
            for(int y = 0; y < (vectorSueldos.length-1); y++){
                if(vectorSueldos[y] > vectorSueldos[y+1]){
                    int aux = vectorSueldos [y];
                    vectorSueldos [y] = vectorSueldos [y+1];
                    vectorSueldos[y+1] = aux;
                }
            }
        }
    }
    
    public void imprimirBurbuja(){
        System.out.println("Vector ordenado de menor a mayor");
        for(int x = 0; x < vectorSueldos.length; x++){
            System.out.print("[" + vectorSueldos[x] + "]");
        }
    }
}

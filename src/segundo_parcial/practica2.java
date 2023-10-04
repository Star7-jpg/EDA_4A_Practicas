package segundo_parcial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practica2 {

    //Bufer de entrada como variable global
    public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;

    public static int [] leerArreglo(int n) throws IOException{

        int[] califs = new int[n];
        System.out.println("Escriba los valores del arreglo");

        for (int i = 0; i < n; i++) {
            System.out.println("Escriba el valor para la posición " + i + " :");
            entrada = bufer.readLine();
            califs[i] = Integer.parseInt(entrada);
        }
        return califs;
    }

    //Método para imprimir el contenido
    public static void imprimirArreglo(int[] califs){ //¡Los métodos void no retornan valores!

        System.out.println("Valores del arreglo");
        for (int i = 0; i < califs.length; i++) {
            System.out.println( califs[i]);
            }
        }

    public static void numeroMaximo(int[] califs){ //¡Los métodos void no retornan valores!

        int max = califs[0];
        for(int recorrido:califs){
            if (recorrido>max) {
                max = recorrido;
            }
        }
        System.out.println("Número máximo: " + max);
    }
    
    public static void numeroMinimo(int[] califs){
        
        int min = califs[0];
        for(int recorrido : califs){
            if (recorrido<min) {
                min = recorrido;
            }
        }
        System.out.println("Número mínimo: " + min);
    }

    public static void numerosPares(int[] califs){

        int i = 0;
        System.out.println("Números pares: ");
        for(int recorrido : califs){
            if (recorrido % 2 == 0) {
                System.out.print(" " + recorrido + " ");               
                i++;
            }
        }
        System.out.println();
        System.out.println("Cantidad de números pares: " + i);
    }

    public static void numerosImpares(int[] califs){

        int i = 0;
        System.out.println("Números impares: ");
        for(int recorrido : califs){
            if (recorrido % 2 != 0) {
                System.out.print(" " + recorrido + " ");               
                i++;
            }
        }
        System.out.println();
        System.out.println("Cantidad de números impares: " + i);
    }

    public static void main(String[] args) throws Exception{

        int tam;
        int [] arreglo;

        System.out.println("Introduce el tamaño del arreglo: ");
        entrada = bufer.readLine();
        tam = Integer.parseInt(entrada);

        arreglo = leerArreglo(tam);
        numeroMaximo(arreglo);
        numeroMinimo(arreglo);
        numerosPares(arreglo);
        numerosImpares(arreglo);
    }
    
}

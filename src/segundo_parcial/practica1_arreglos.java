package segundo_parcial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class practica1_arreglos {

    //Bufer de entrada como variable global
    public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;

    public static double [] leerCalificaciones(int n) throws IOException{
        double[] califs = new double[n];
        System.out.println("Escriba los promedios individuales");
        for (int i = 0; i < n; i++) {
            System.out.println("Escriba el promedio individual del alumno con el id " + i + ":");
            entrada = bufer.readLine();
            califs[i] = Double.parseDouble(entrada);
        }
        return califs;
    }

    //Método para calcular el promedio
    public static double calcularPromedioGrupo(double[] proms){

        double suma = 0;
        for (int i = 0; i < proms.length; i++) {
            suma = suma + proms[i]; 
        }
        return (suma/proms.length);
    }

    //Método para imprimir el contenido
    public static void imprimirCalificaciones(double[] califs){ //¡Los métodos void no retornan valores!

        System.out.println("Promedio de cada grupo");
        for (int i = 0; i < califs.length; i++) {
            System.out.println(califs[i]);
        }
    }

    public static void main(String[] args) throws Exception{

        double grupo_1a[]; //= {5.7, 9.8, 6.6, 8.9, 8.8};
        double grupo_1b[]; // = {9.0, 8.5, 10.0, 7.5, 6.4};
        double grupo_4a[]; //= {8.8, 9.4, 9.7, 8.9, 7.5};
        double grupo_4b[]; //= {7.6, 7.7, 8.8, 8.9, 10.0};
        double grupo_4c[]; // = {10.0, 10.0, 9.5, 7.4, 5.2};


        System.out.println();
        System.out.println("Escribe el tamaño de un grupo 1a: ");
        entrada = bufer.readLine();
        int t = Integer.parseInt(entrada);
        grupo_1a = leerCalificaciones(t);
        System.out.println();

        System.out.println();
        System.out.println("Escribe el tamaño de un grupo 1b: ");
        entrada = bufer.readLine();
        int s = Integer.parseInt(entrada);
        grupo_1b = leerCalificaciones(s);
        System.out.println();
        
        System.out.println();
        System.out.println("Escribe el tamaño de un grupo 4a: ");
        entrada = bufer.readLine();
        int r = Integer.parseInt(entrada);
        grupo_4a = leerCalificaciones(r);
        System.out.println();
        
        System.out.println();
        System.out.println("Escribe el tamaño de un grupo 4b: ");
        entrada = bufer.readLine();
        int f = Integer.parseInt(entrada);
        grupo_4b = leerCalificaciones(f);
        System.out.println();
        
        System.out.println();
        System.out.println("Escribe el tamaño de un grupo 4c: ");
        entrada = bufer.readLine();
        int h = Integer.parseInt(entrada);
        grupo_4c = leerCalificaciones(h);
        System.out.println();
        
        double [] grupos = new double[5];

        grupos[0] = calcularPromedioGrupo(grupo_1a);
        grupos[1] = calcularPromedioGrupo(grupo_1b);
        grupos[2] = calcularPromedioGrupo(grupo_4a);
        grupos[3] = calcularPromedioGrupo(grupo_4b);
        grupos[4] = calcularPromedioGrupo(grupo_4c);
 
        imprimirCalificaciones(grupos);

        double promedio = calcularPromedioGrupo(grupos);
        System.out.println("Promedio general: " + promedio);
    }
}

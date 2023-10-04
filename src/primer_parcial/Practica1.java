package primer_parcial;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practica1 {
 
    public static BufferedReader bufer=new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;   
    
    public static void main(String[] args) throws IOException {
        System.out.println("Escribe el valor de y ");
        int y;
        entrada = bufer.readLine();
        y=Integer.parseInt(entrada);

        System.out.println("Escribe el valor de z ");
        int z;
        entrada = bufer.readLine();
        z=Integer.parseInt(entrada);

        int resultado = sumatoria(y, z);
        System.out.println("La sumatoria es igual a: " + resultado);
    }

    public static int sumatoria(int start, int end) {
        if (start > end) {
            return 0;
        } else {
            int cuadrado = start * start;
            return cuadrado + sumatoria(start + 1, end);
 }
}
}

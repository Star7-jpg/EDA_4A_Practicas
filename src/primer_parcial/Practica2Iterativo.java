package primer_parcial;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica2Iterativo {
    public static void main(String[] args) throws Exception {

        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        double dividendo, divisor;

        System.out.println("Escribe el valor del dividendo: ");
        entrada=bufer.readLine();
        dividendo=Double.parseDouble(entrada);

        System.out.println("Escribe el valor del divisor: ");
        entrada=bufer.readLine();
        divisor=Double.parseDouble(entrada);

        double value1 = dividendo, value2 = divisor;

        while (dividendo % divisor != 0) {
            double div = dividendo / divisor;
            double result = Math.floor(div); 
            double mult = result * divisor; 
            double rest = dividendo - mult; 
            dividendo = divisor;
            divisor= rest;
        }
        
        System.out.println("El máximo común divisor de " + value1 + " y " + value2 +" es: " + divisor);
    }
}

package primer_parcial;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica2 {
    public static void main(String[] args) throws Exception {

        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        
        double dividendo;
        double divisor;

        System.out.println("Escribe el valor del dividendo: ");
        entrada=bufer.readLine();
        dividendo=Double.parseDouble(entrada);

        System.out.println("Escribe el valor del divisor: ");
        entrada=bufer.readLine();
        divisor=Double.parseDouble(entrada);

        double resultado = division(dividendo, divisor);
        System.out.println("El máximo común divisor de " + dividendo + " y " + divisor + " es: " + resultado);
    }

    public static double division(double x, double y){
        if (x % y == 0) {
            return y;
        }else{
            double div = x / y;
            double result = Math.floor(div); //Se redondea el resultado hacia abajo. Ejemplo: 15.9 = 15
            double mult = result * y; //Se multiplica el resultado de la división por el divisor
            double rest = x - mult; //Se resta el resultado de la multiplicación al dividendo
            return division(y, rest); //Se envía el divisor en la posición del dividendo y el resultado de la resta en la posición del divisor
        }
    }
}

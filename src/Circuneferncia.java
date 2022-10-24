import java.util.Scanner;
public class Circuneferncia {
    public static void main (String [] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el radio de tu circunferencia (en centímetros)");
        double radio = sc.nextDouble();
        System.out.println("El area de tu circunferencia es de " + radio * radio * Math.PI + " centímetros y la longitud de este es de " + 2 * Math.PI * radio + " centímetros");
    }
}
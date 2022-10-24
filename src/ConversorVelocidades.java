import java.util.Scanner;
public class ConversorVelocidades {
    public static void main (String [] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la velocidad que quieras saber en metros por segundo (km/h)");
        double velocidad = sc.nextDouble()*100/60;
        System.out.println("La velocidad serían " + velocidad + " m/s");
    }
}
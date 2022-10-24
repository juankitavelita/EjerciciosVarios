import java.util.Scanner;
public class ConversorGrados {
    public static void main (String [] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los grados celsius que quieres traducir a farenheit");
        double grados = sc.nextDouble() * 1.8 + 32;
        System.out.println(grados + " grados celsius son " + grados + " grados farenheit");
    }
}
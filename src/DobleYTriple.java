import java.util.Scanner;
public class DobleYTriple {
    public static void main (String [] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu número");
        int numero = sc.nextInt();
        System.out.println("El doble del número " + numero + " es " + numero*2 + " y el triple es " + numero*3);
    }
}
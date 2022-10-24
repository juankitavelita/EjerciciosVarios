import java.util.Scanner;
public class NumerosPantalla {
    public static void main (String [] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el valor de X");
        int x=sc.nextInt();
        System.out.println("Introduce el valor de Y");
        int y=sc.nextInt();
        System.out.println("El valor de x es " + x + " y el valor de y es " + y);
    }
}
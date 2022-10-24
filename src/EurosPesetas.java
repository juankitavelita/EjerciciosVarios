import java.util.Scanner;
public class EurosPesetas {
    public static void main (String [] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Si quieres traducir de euros a pesetas escribe '1', si quieres traducir de pesetas a euros escribe '2'");
        int conversion = sc.nextInt();
        if(conversion == 1){
            System.out.println("Introduce la cantidad de euros a traducir");
            double dinero = sc.nextDouble()*166.386;
            System.out.println("La cantidad introducida equivale a un total de " + dinero + " pesetas.");
        }else if(conversion == 2){
            System.out.println("Introduce la cantidad de pesetas a traducir");
            double dinero = sc.nextDouble()/166.386;
            System.out.println("La cantidad introducida equivale a un total de " + dinero + " euros.");
        }else{
            System.out.println("Error. El dato introducido es incorrecto.");
        }
    }
}
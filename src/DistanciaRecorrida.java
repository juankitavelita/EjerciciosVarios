import java.util.Scanner;
public class DistanciaRecorrida {
    public static void main (String [] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la distancia recorrida en kilómetros");
        double distancia = sc.nextDouble();
        System.out.println("Introduce el tiempo de recorrido en horas");
        double tiempo = sc.nextDouble();
        System.out.println("La velocidad a la que se ha realizado el recorrido es de " + distancia/tiempo + " k/h.");
    }
}
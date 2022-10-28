import java.util.Scanner;
public class ElMayorDe10Numeros {
    public static void main (String [] args){
        final int cantidad = 10;
        int lista[] = new int [cantidad];
        Scanner sc = new Scanner(System.in);
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        for(int i = 0; i < lista.length; i++){
            System.out.println("Introduce tu número " + (i+1));
            String numero = sc.next();
            lista[i] = Integer.parseInt(numero);
            if(mayor < lista[i]) {
                mayor = lista[i];
            }
            if(menor > lista[i]){
                menor = lista[i];
            }
        }
        System.out.println("El número mas grande es el número " + mayor);
        System.out.println("El número mas pequeño es el número " + menor);
    }
}
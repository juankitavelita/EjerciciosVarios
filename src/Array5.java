import java.util.Scanner;
public class Array5 {
    public static void main (String [] args){
        final int largo = 5;
        int dato[] = new int [largo];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<dato.length; i++){
            System.out.println("Introduce el número que quieras sumar");
            String texto = sc.next();
            dato[i] = Integer.parseInt(texto);
        }
        int suma = 0;
        for(int b = 0; b<dato.length; b++){
            suma = suma + dato[b];
        }
        System.out.println("La suma de todos los números es " + suma);
    }
}

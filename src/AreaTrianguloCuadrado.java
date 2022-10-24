import java.util.Scanner;
public class AreaTrianguloCuadrado {
    public static void main (String [] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Si deseas calcular el area de un triángulo escribe '1', si es el de un cuadrado escribe '2' y si es el de un pentágono escribe '3'");
        int eleccion = sc.nextInt();
        if(eleccion == 1){
            System.out.println("Introduce la base del triangulo (metros cuadrados)");
            double base = sc.nextDouble();
            System.out.println("Escribe la altura del triangulo (metros cuadrados)");
            double altura = sc.nextDouble();
            System.out.println("El area del triangulo es " + base*altura/2 + " metros cuadrados.");
        }else if(eleccion == 2){
            System.out.println("Introduce la base del cuadrado (metros cuadrados)");
            double base = sc.nextDouble();
            System.out.println("Escribe la altura del cuadrado (metros cuadrados)");
            double altura = sc.nextDouble();
            System.out.println("El area del cuadrado es " + base*altura + " metros cuadrados.");
        }else if(eleccion == 3){
            System.out.println("Introduce la longitud de cada lado de tu pentágono (metros cuadrados)");
            double lado = sc.nextDouble();
            System.out.println("Escribe el apotema del pentágono (metros cuadrados)");
            double apotema = sc.nextDouble();
            System.out.println("El area del cuadrado es " + lado*5*apotema/2 + " metros cuadrados.");
        }else{
            System.out.println("Error. El dato introducido es incorrecto.");
        }
    }
}
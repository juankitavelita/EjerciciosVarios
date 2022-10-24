import java.util.Scanner;
public class Calculadora {
    public static void main (String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Bienvenido a Calculator 3000");
        int accion = 0;
        while(accion == 0){
            System.out.println("Si quieres sumar introduce 1, si quieres restar introduce 2, si quieres multiplicar introduce 3 y si quieres dividir introduce 4:");
            accion = sc.nextInt();
            switch(accion){
                case 1->{
                    System.out.println("Introduce, en orden de cálculo, que 2 datos quieres sumar:");
                    double dato1 = sc.nextDouble();
                    double dato2 = sc.nextDouble();
                    System.out.println("La suma entre " + dato1 + " y " + dato2 + " es " + (dato1+dato2));
                }
                case 2->{
                    System.out.println("Introduce, en orden de cálculo, que 2 datos quieres restar:");
                    double dato1 = sc.nextDouble();
                    double dato2 = sc.nextDouble();
                    System.out.println("La resta entre " + dato1 + " y " + dato2 + " es " + (dato1-dato2));
                }
                case 3->{
                    System.out.println("Introduce, en orden de cálculo, que 2 datos quieres multiplicar:");
                    double dato1 = sc.nextDouble();
                    double dato2 = sc.nextDouble();
                    System.out.println("La multiplicación entre " + dato1 + " y " + dato2 + " es " + (dato1*dato2));
                }
                case 4->{
                    System.out.println("Introduce, en orden de cálculo, que 2 datos quieres dividir:");
                    double dato1 = sc.nextDouble();
                    double dato2 = sc.nextDouble();
                    System.out.println("La división entre " + dato1 + " y " + dato2 + " es " + (dato1/dato2));
                }
                default->{
                    System.out.println("Dato incorrecto, por favor lee bien las indicaciones");
                    accion = 0;
                }
            }
        }
    }
}
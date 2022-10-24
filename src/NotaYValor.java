import java.util.Scanner;
public class NotaYValor {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nota");
        int nota = sc.nextInt();
        switch(nota){
            case 0, 1, 2, 3, 4 -> {
                System.out.println("Hola");
            }
            case 5 -> {
                System.out.println("Enhorabuena, tu nota es un suficiente, intenta mejorarla la próxima vez.");
            }
            case 6 -> {
                System.out.println("Enhorabuena, tu nota es un bien, intenta mejorarla la próxima vez.");
            }
            case 7 -> {
                System.out.println("Enhorabuena, tu nota es un notable bajo, no está mal.");
            }
            case 8 -> {
                System.out.println("Enhorabuena, tu nota es un notable alto, sigue así.");
            }
            case 9 -> {
                System.out.println("Enhorabuena, tu nota es un excelente, ¡casi tienes el 10!.");
            }
            case 10 -> {
                System.out.println("Enhorabuena, tu nota es una matrícula de honor, '¡increible!'");
            }
            default -> {
                System.out.println("Recuerda que las notas van del 0 al 10.");
            }
        }
    }
}

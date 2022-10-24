import java.util.Scanner;
public class LaboralOFestivo {
    public static void main (String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce un día de este mes.");
        int dia = sc.nextInt();
        if(dia > 0 && dia < 32){
            switch(dia){
                case 1, 2, 8, 9, 12, 15, 16, 22, 23, 29, 30->{
                    System.out.println("El día " + dia + " si es festivo.");
                }
                default->{
                    System.out.println("El día " + dia + " no es festivo.");
                }
            }
        }else{
            System.out.println("El día " + dia + " no es un día del mes de Octubre.");
        }
    }
}
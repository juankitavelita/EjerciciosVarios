import java.util.Scanner;
public class Contrasena {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String contra = "Paquito123";
        String pass = "";
        int intento = 3;
        System.out.println("Introduce la contraseña");
        while(intento > 0){
            pass = sc.next();
            if(contra.equals(pass)){
                intento = -1;
            }else if(intento != 1){
                intento--;
                System.out.println("Contraseña incorrecta, te quedan " + intento + " intentos.");
            }else{
                intento--;
            }
        }
        if(intento == -1){
            System.out.println("Enhorabuena, contraseña correcta");
        }else{
            System.out.println("Has superado el número de intentos, inténtalo mas tarde");
        }
    }
}
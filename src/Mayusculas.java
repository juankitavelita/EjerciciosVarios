import java.io.IOException;
public class Mayusculas {
    public static void main(String [] args) throws IOException {
        System.out.println("Introduce un solo carácter (solo 1)");
        char car1 = ((char)System.in.read());
        if (Character.isUpperCase(car1)){
            System.out.println("El carácter es un carácter en mayúsculas");
        }else if (Character.isLowerCase(car1)){
            System.out.println("El carácter es un carácter en minúscula");
        }else{
            System.out.println("Error, no has introducido una letra del alfabeto");
        }
    }
}
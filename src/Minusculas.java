import java.io.IOException;
public class Minusculas {
    public static void main(String [] args) throws IOException {
        System.out.println("Introduce un solo carácter (solo 1)");
        char car1 = ((char)System.in.read());
        if (Character.isLowerCase(car1)){
            System.out.println("El carácter es un carácter en minúsculas");
        }else if (Character.isUpperCase(car1)){
            System.out.println("El carácter es un carácter en mayúsculas");
        }else{
            System.out.println("Error, no has introducido una letra del alfabeto");
        }
    }
}
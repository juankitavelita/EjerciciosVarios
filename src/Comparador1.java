import java.io.IOException;
public class Comparador1 {
    public static void main(String [] args) throws IOException {
        System.out.println("Introduce el primer carácter");
        char comp1 = ((char)System.in.read());
        System.in.read();
        System.out.println("Introduce el segundo carácter");
        char comp2 = ((char)System.in.read());
        if(comp1 == comp2){
            System.out.println("Estos caracteres son el mismo");
        }else{
            System.out.println("Estos caracteres no son el mismo");
        }
    }
}
  
import java.util.Scanner;


public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.println("Ingresar un numero entero: ");
        int num = scan.nextInt();
        scan.close();

        for (int i = 1; i <=num; ++i){

            for ( int n = 1; n <= i; ++n) {

                System.out.print(n);

            }
            System.out.println(" ");
        }
        
        
    }
    
}

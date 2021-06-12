import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Porfavor ingrese un numer entero: ");
        int num = scan.nextInt();

        scan.close();

        var mul = 1;

        for (int i = 1; i <= num; ++i){

            mul *=i;
            
        }

        System.out.println(mul);

    }
}

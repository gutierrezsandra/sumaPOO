import java.util.Scanner;

public class MainSuma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Suma de 2 numeros");
        System.out.println("Ingrese un numero:");
        int a = scanner.nextInt();
        System.out.println("Ingrese segundo numero:");
        int b = scanner.nextInt();
        
        int result = a + b;
        System.out.println("El resultado es: " + result);
    }
}

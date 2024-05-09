import java.util.Scanner;

public class SecuenciaFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantos numeros de la secuencia de Fibonacci,");
        System.out.println("quieres que genere y muestre por pantalla");
        int numero = Integer.parseInt(sc.nextLine());
        int primerN = 0;
        int segundoN = 1;

        System.out.println("____________________________________");
        System.out.printf("Impresión de los primeros %d numeros\n", numero);
        System.out.printf("             Fibonacci\n");
        System.out.println("____________________________________");
        //System.out.printf("%d %d ", primerN, segundoN);
        for (int i = 0; i <= numero; i++){
            System.out.printf("%d ", primerN);
            int siguiente = primerN + segundoN;
            primerN = segundoN;
            segundoN = siguiente;
        }
        System.out.println("\n____________________________________");
    }
}

import java.util.Scanner;

public class SoloPares2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite un numero entero positivo: ");
        int n = Integer.parseInt(sc.nextLine());
        int contador = 0;

        System.out.println("__________________________________________");
        System.out.printf("Impresión de los primeros %d numeros pares\n", n);
        System.out.printf("             Excluyendo el 0\n");
        System.out.println("__________________________________________");
        while (contador <= n) {
            for (int i = 1; i <= n; i++) {
                contador += 2;
                System.out.printf("[%d] -> %d\n", i, contador);
            }
        }
        System.out.println("__________________________________________");
    }
}

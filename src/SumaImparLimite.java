import java.util.Scanner;

public class SumaImparLimite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numeros entero positivo como límite inferior: ");
        int numInf = Integer.parseInt(sc.nextLine());
        System.out.println("Ingresa un numeros entero positivo como límite superior: ");
        int numSup = Integer.parseInt(sc.nextLine());

        int acumulador = 0;
        StringBuilder numerosImpares = new StringBuilder();
        int contador = numInf;

        while (contador < numSup) {
            if (contador %2 != 0){
                if (acumulador != 0) {
                    numerosImpares.append(" + ");
                }
                numerosImpares.append(contador);
                acumulador += contador;
            }
            contador ++;
        }
        System.out.println("============================================================================");
        System.out.printf("La suma de los números impares desde %d hasta %d es:\n%s = %d\n", numInf, numSup, numerosImpares, acumulador);
        System.out.println("============================================================================");
    }
}

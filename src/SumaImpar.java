import java.util.Scanner;

public class SumaImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numeros entero positivo: ");
        int numero = Integer.parseInt(sc.nextLine());

        int acumulador = 0;
        StringBuilder numerosImpares = new StringBuilder();
        int contador = 0;

        while (contador < numero) {
            if (contador %2 != 0){
                if (acumulador != 0) {
                    numerosImpares.append(" + ");
               }
                numerosImpares.append(contador);
                acumulador += contador;
            }
            contador ++;
        }
        System.out.println("La suma de los números impares desde 1 hasta " + numero + " es: \n" + numerosImpares + " = " + acumulador);
    }
}

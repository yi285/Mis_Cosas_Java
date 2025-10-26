import java.util.Scanner;
import java.util.InputMismatchException;

public class Calculadora {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        int numero_veces = 0;

        while (numero_veces != 10) {
            double num1 = 0;
            double num2 = 0;
            boolean numerosValidos = false;

            // Leer números sin while(true)
            while (!numerosValidos) {
                try {
                    System.out.println(" ");
                    System.out.println("----Informacion----");
                    System.out.println("Dime el primer numero");
                    num1 = lector.nextDouble();

                    System.out.println("Dime el segundo numero");
                    num2 = lector.nextDouble();

                    numerosValidos = true; // todo correcto, salimos del bucle
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, ingresa números válidos.");
                    lector.next(); // limpiar input inválido
                }
            }

            // Menú de opciones
            System.out.println(" ");
            System.out.println("----OPCIONES----");
            System.out.println("Dividir = 0");
            System.out.println("Multiplicar = 1");
            System.out.println("Sumar = 2");
            System.out.println("Restar = 3");
            System.out.println(" ");

            int opcion = -1;
            try {
                opcion = lector.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingresa un número válido para la opción.");
                lector.next();
                continue;
            }
            switch (opcion) {
                case 0:
                    if (num2 != 0) {
                        System.out.println("Resultado = " + (num1 / num2));
                    } else {
                        System.out.println("Error: no se puede dividir entre cero");
                    }
                    numero_veces++;
                    System.out.println(" ");
                    break;
                case 1:
                    System.out.println("Resultado = " + (num1 * num2));
                    numero_veces++;
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println("Resultado = " + (num1 + num2));
                    numero_veces++;
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println("Resultado = " + (num1 - num2));
                    numero_veces++;
                    System.out.println(" ");
                    break;
                default:
                    System.out.println("Elije la opcion correcta");
                    System.out.println(" ");
                    break;
            }

        }

        lector.close();
        System.out.println("Se han realizado 10 operaciones. ¡Gracias por usar la calculadora!");
    }
}
